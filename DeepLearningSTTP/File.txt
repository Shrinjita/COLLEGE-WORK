# Get input from user
$number1 = Read-Host "Enter the first number"
$number2 = Read-Host "Enter the second number"
$operator = Read-Host "Enter the operator (+, -, *, /)"

# Convert inputs to numbers
[float]$num1 = $number1
[float]$num2 = $number2

# Perform calculation based on the operator
switch ($operator) {
    "+" { $result = $num1 + $num2 }
    "-" { $result = $num1 - $num2 }
    "*" { $result = $num1 * $num2 }
    "/" { 
        if ($num2 -eq 0) {
            Write-Output "Error: Division by zero is not allowed."
            exit
        }
        $result = $num1 / $num2
    }
    default { Write-Output "Invalid operator." ; exit }
}

# Output the result
Write-Output "Result: $result"
