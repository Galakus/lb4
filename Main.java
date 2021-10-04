package lb1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа.");
        System.out.println("2.Ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа.");
        System.out.println("3.Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1, в противном случае не изменять его. Вывести полученное число.");
        System.out.println("4.Ввести целое число в консоли. Если оно является положительным, то прибавить к нему 1; если отрицательным, то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.");
        System.out.println("5.Ввести три целых числа с консоли. Вывести на экран наименьшее из них.");
        System.out.println("6.Ввести целое число в консоли. Вывести его строку-описание вида «отрицательное четное число», «нулевое число», «положительное нечетное число» и т. д.");
        System.out.println("7.Вычислить стоимость 10 минутного междугороднего разговора в зависимости от кода города. (Москва(905) - 4.15 руб. Ростов(194) - 1.98 руб. Краснодар(491) - 2.69 руб. Киров(800) - 5.00руб.). Пользователь в консоли должен ввести код города, а в ответ от программы получить, например, при вводе кода 905, - «Москва. Стоимость разговора: 41.5»");
        System.out.println("8.Дан массив целых чисел: [1,-10,5,6,45,23, 45,-34,0,32,56,-1,2,-2]. Для данного массива найти и вывести на экран: максимальное значение, сумму положительных элементов, сумму четных отрицательных элементов, количество положительных элементов, среднее арифметическое отрицательных элементов.");
        System.out.println("9.Дан массив целых чисел: [15,10,51, 6, 5,3, 10,-34,0,32,56, 12,24, 52]. Переставить элементы массива в обратном порядке. Вывести результат в консоль.");
        System.out.println("10.Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52]. Переместить нули в конец массива. Вывести результат в консоль.");
        System.out.println("Выберите номер задания, затем аргумент если это требуется: ");
        int Variable = scan.nextInt();
        System.out.print("\n");
        switch (Variable){
            case 1:
                int value_numb = scan.nextInt();
                System.out.print("Ответ: "+last_number(value_numb));
                break;
            case 2:
                int value_numb2 = scan.nextInt();
                System.out.print("Ответ: "+number_summ(value_numb2));
                break;
            case 3:
                int value_numb3 = scan.nextInt();
                System.out.print("Ответ: "+positive_value(value_numb3));
                break;
            case 4:
                int value_numb4 = scan.nextInt();
                System.out.print("Ответ: "+compare_value(value_numb4));
                break;
            case 5:
                int value1 = scan.nextInt();
                int value2 = scan.nextInt();
                int value3 = scan.nextInt();
                System.out.print("Ответ: "+comparison_of_numbers(value1,value2,value3));
                break;
            case 6:
                int value_numb6 = scan.nextInt();
                System.out.print("Ответ: "+desc(value_numb6));
                break;
            case 7:
                int code = scan.nextInt();
                System.out.print(stoimost(code));
                break;
            case 8:
                int[] array={1,-10,5,6,45,23,45,-34,0,32,56,-1,2,-2};
                array_operations(array);
                break;
            case 9:
                int[] array1={15,10,51,6,5,3,10,-34,0,32,56,12,24,52};
                reverse_array(array1);
                break;
            case 10:
                int[] array2={15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52};
                zeros(array2);
                break;
            default:
                System.out.print("Некорректный номер задания");
                break;
        }
        scan.close();
    }

    static int last_number(int value){
        int lastnumb = value % 10;
        return (lastnumb);
    }
    static int number_summ(int value){
        String s = ""+value;
        String[] a = s.split("");
        int val=0;
        for(int i=0;i<a.length;i++){
            val+=Integer.parseInt(a[i]);
        }
        return (val);
    }
    static int positive_value(int value){
        if(value>0){
            value++;
        }
        return (value);
    }
    static int compare_value(int value){
        if(value>0){
            value++;
        }else if(value==0){
            value=10;
        }else  if(value<0){
            value-=2;
        }
        return (value);
    }
    static int comparison_of_numbers(int value1,int value2,int value3){
        int min = value1;
        if(value2<min){
            min=value2;
        }
        if(value3<min){
            min=value3;
        }
        return (min);
    }
    static String desc(int value){
        String desc="";
        if(value>0){
            desc="Положительное";
        }else if(value==0){
            desc="Нулевое";
        }else  if(value<0){
            desc="Отрицательное";
        }
        if(value!=0){
            if((value%2)==0){
                desc+=" четное";
            }else{
                desc+=" не четное";
            }
        }
        return(desc);
    }
    static String stoimost(int citynum){
        String answer="";
        switch (citynum){
            case 905:
                answer="Москва. Стоимость разговора: 41.5 руб";
                break;
            case 194:
                answer="Ростов. Стоимость разговора: 19.8 руб";
                break;
            case 491:
                answer="Краснодар. Стоимость разговора: 26.9 руб";
                break;
            case 800:
                answer="Киров. Стоимость разговора: 50.0 руб";
                break;
            default:
                answer="Некорректный код города";
                break;
        }
        return(answer);
    }
    static void array_operations(int[] array){
        int max = array[0];
        int summ_positive=0;
        int even_negative_number=0;
        int positive_count=0;
        int neagtive_count=0;
        int negative_summ=0;
        for(int i=0;i<array.length;i++) {
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]>0){
                summ_positive+=array[i];
                positive_count+=1;
            }
            if(array[i]<0){
                negative_summ+=array[i];
                neagtive_count+=1;
                if((array[i]%2)==0){
                    even_negative_number+=array[i];
                }
            }
        }
        float srd_arif=negative_summ/neagtive_count;
        System.out.println("Максимальное значение: "+max+
                "\n"+"Сумма положительных элементов: "+summ_positive+"\n"+
                "Сумму четных отрицательных элементов: "+even_negative_number+
                "\n"+"Количество положительных элементов: "+positive_count+"\n"
                +"Среднее арифметическое отрицательных элементов: "+srd_arif+"\n");
    }
    static void reverse_array(int[] array){
        String content="Перестановка чисел массива [";
        int[] reverse_array;
        reverse_array= new int[array.length];
        int j=array.length-1;
        for(int i=0;i<array.length;i++) {
            reverse_array [i]=array [j];
            j--;
        }
        for(int i=0;i<reverse_array.length;i++) {
            if(i<reverse_array.length-1){
                content+=reverse_array[i]+",";
            }else{
                content+=reverse_array[i];
            }
        }
        System.out.println(content+"]");
    }
    static void zeros(int[] array){
        int[] new_array;
        String content="[";
        new_array= new int[array.length];
        int j=0;
        for(int i=0;i<array.length;i++) {
            if(array[i]!=0){
                content+=array[i]+",";
                j++;
            }
        }
        for(int k=j ;k<array.length;k++){
            if(k<array.length-1){
                content+="0,";
            }else{
                content+="0";
            }
        }
        System.out.println(content+"]");

    }
}