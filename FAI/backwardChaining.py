def back_chain(goal,rules,facts):
    if goal in facts:
        return True
    for rule in rules:
        if rule[0]==goal:
            conditions_satisfied=all(back_chain(condition,rules,facts) for condition in rule[1])
            if conditions_satisfied:
                facts.append(goal)
                return True
if __name__=="_main_":
    rules=[("clean_room",["pick_up_toys","vacuum_floor"]),
           ("pick_up_toys",["find_toys"]),
           ("find_toys",["know_location_of_toys"]),
           ("know_location_of_toys",["ask_parents"]),
           ("vacuum_floor",["move_furniture"])
           ]
    initial_facts=["move_furniture"]
    goal = "vacuum_floor"




    
