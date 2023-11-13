import pandas as pd
from pathlib import Path
# path = Path("C:/Users/Desktop/Sem-5/CS301 CN/Project/Voting/database")
path = Path("database")

def count_reset():
    df=pd.read_csv(path/'voterList.csv')
    df=df[['voter_id','Name','Gender','Aadhar Number','City','Passw','hasVoted']]
    for index, row in df.iterrows():
        df['hasVoted'].iloc[index]=0
    df.to_csv(path/'voterList.csv')

    df=pd.read_csv(path/'cand_list.csv')
    df=df[['Sign','Name','Vote Count']]
    for index, row in df.iterrows():
        df['Vote Count'].iloc[index]=0
    df.to_csv (path/'cand_list.csv')


def reset_voter_list():
    df = pd.DataFrame(columns=['voter_id','Name','Gender','Aadhar Number','City','Passw','hasVoted'])
    df=df[['voter_id','Name','Gender','Aadhar Number','City','Passw','hasVoted']]
    df.to_csv(path/'voterList.csv')

def reset_cand_list():
    df = pd.DataFrame(columns=['Sign','Name','Vote Count'])
    df=df[['Sign','Name','Vote Count']]
    df.to_csv(path/'cand_list.csv')


def verify(vid,passw):
    df=pd.read_csv(path/'voterList.csv')
    df=df[['voter_id','Passw','hasVoted']]
    for index, row in df.iterrows():
        if df['voter_id'].iloc[index]==vid and df['Passw'].iloc[index]==passw:
            return True
    return False


def isEligible(vid):
    df=pd.read_csv(path/'voterList.csv')
    df=df[['voter_id','Name','Gender','Aadhar Number','City','Passw','hasVoted']]
    for index, row in df.iterrows():
        if df['voter_id'].iloc[index]==vid and df['hasVoted'].iloc[index]==0:
            return True
    return False


def vote_update(st,vid):
    if isEligible(vid):
        df=pd.read_csv (path/'cand_list.csv')
        df=df[['Sign','Name','Vote Count']]
        for index, row in df.iterrows():
            if df['Sign'].iloc[index]==st:
                df['Vote Count'].iloc[index]+=1

        df.to_csv (path/'cand_list.csv')

        df=pd.read_csv(path/'voterList.csv')
        df=df[['voter_id','Name','Gender','Aadhar Number','City','Passw','hasVoted']]
        for index, row in df.iterrows():
            if df['voter_id'].iloc[index]==vid:
                df['hasVoted'].iloc[index]=1

        df.to_csv(path/'voterList.csv')

        return True
    return False


def show_result():
    df=pd.read_csv (path/'cand_list.csv')
    df=df[['Sign','Name','Vote Count']]
    v_cnt = {}
    for index, row in df.iterrows():
        v_cnt[df['Sign'].iloc[index]] = df['Vote Count'].iloc[index]
    # print(v_cnt)
    return v_cnt

def isValidAadhar(aadhar):
    df=pd.read_csv(path/'voterList.csv')
    df=df[['voter_id','Name','Gender','Aadhar Number','City','Passw','hasVoted']]
    for index,row in df.iterrows():
        if df['voter_id'].iloc[index]==int(aadhar):
            return False
    return True
            


def taking_data_voter(name,gender,aadhar,city,passw):
    df=pd.read_csv(path/'voterList.csv')
    df=df[['voter_id','Name','Gender','Aadhar Number','City','Passw','hasVoted']]
    row,col=df.shape
    if len(aadhar) == 12 and aadhar.isnumeric() and isValidAadhar(aadhar):
        vid = aadhar
        df1 = pd.DataFrame({"voter_id":[vid],
                    "Name":[name],
                    "Gender":[gender],
                    "Aadhar Number":[aadhar],
                    "City":[city],
                    "Passw":[passw],
                    "hasVoted":[0]},)
        df=df.append(df1,ignore_index=True,verify_integrity=True)
        df.to_csv(path/'voterList.csv')
        return vid
    else:
        return -1
homePage.py
import subprocess as sb_p
import tkinter as tk
from tkinter import *
from Admin import AdmLogin
import registerVoter as regV
from voter import voterLogin


def Home(root, frame1, frame2):

    for frame in root.winfo_children():
        for widget in frame.winfo_children():
            widget.destroy()

    Button(frame2, text="Home", command = lambda: Home(root, frame1, frame2)).grid(row=0,column=0)
    Label(frame2, text="                                                                         ").grid(row = 0,column = 1)
    Label(frame2, text="                                                                         ").grid(row = 0,column = 2)
    Label(frame2, text="         ").grid(row = 1,column = 1)
    frame2.pack(side=TOP)

    root.title("Home")

    Label(frame1, text="Home", font=('Helvetica', 25, 'bold')).grid(row = 0, column = 1, rowspan=1)
    Label(frame1, text="").grid(row = 1,column = 0)
    #Admin Login
    admin = Button(frame1, text="Admin Login", width=15, command = lambda: AdmLogin(root, frame1))

    #Voter Login
    voter = Button(frame1, text="Voter Login", width=15, command = lambda: voterLogin(root, frame1))

    #New Tab
    newTab = Button(frame1, text="New Window", width=15, command = lambda: sb_p.call('start python homePage.py', shell=True))

    registerVoter = Button(frame1, text="Register Voter", width=15, command = lambda: regV.Register(root, frame1))

    Label(frame1, text="").grid(row = 2,column = 0)
    Label(frame1, text="").grid(row = 4,column = 0)
    Label(frame1, text="").grid(row = 6,column = 0)
    Label(frame1, text="").grid(row = 8,column = 0)
    admin.grid(row = 3, column = 1, columnspan = 2)
    voter.grid(row = 7, column = 1, columnspan = 2)
    newTab.grid(row = 9, column = 1, columnspan = 2)
    registerVoter.grid(row = 5, column = 1, columnspan = 2)
    frame1.pack()
    root.mainloop()


def new_home():
    root = Tk()
    root.geometry('500x500')
    frame1 = Frame(root)
    frame2 = Frame(root)
    Home(root, frame1, frame2)


if __name__ == "__main__":
    new_home()



