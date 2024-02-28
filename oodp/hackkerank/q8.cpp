class Student {
private:
    vector<int> scores;

public:
    void input() {
        int score;
        for (int i = 0; i < 5; i++) {
            cin >> score;
            scores.push_back(score);
        }
    }

    int calculateTotalScore() {
        int totalScore = 0;
        for (int i = 0; i < scores.size(); i++) {
            totalScore += scores[i];
        }
        return totalScore;
    }
};