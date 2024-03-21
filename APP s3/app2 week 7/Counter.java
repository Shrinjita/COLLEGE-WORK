class Counter {
    private String inputString;

    public Counter(String inputString) {
        this.inputString = inputString;
    }

    public int countDigits() {
        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public int countAlphabeticChars() {
        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }
}
