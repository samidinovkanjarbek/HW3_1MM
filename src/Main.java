public class Main {
    public static void main(String[] args) {
                double[] numbers = {32.9, 8.21, 5.34, 9.28, -19.45, 3.10, -5.12, 67.1, 13.5, -56.2, 55.12, 43.7, -12.16, 15.65, 11.45 } ;

                boolean num1 = false;
                double sum = 0;
                int count = 0;

                for (double num:numbers){
                    if (num<1){
                        num1 = true;
                    }
                    if (num1 == true && num >0){
                        sum += num;
                        count++;
                    }
                }

                System.out.println("Колл-во положительных чисел после 1 отрицательного:" + count);
                System.out.println("Среднее арифметическое:" + sum/count);
            }
        }