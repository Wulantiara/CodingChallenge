import java.util.Scanner;

public class menghitungBmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double massaUdinData1 = 78.0;
        double tinggiUdinData1 = 1.69;

        double massaNanangData1 = 92.0;
        double tinggiNanangData1 = 1.95;

        double massaUdinData2 = 95.0;
        double tinggiUdinData2 = 1.88;

        double massaNanangData2 = 85.0;
        double tinggiNanangData2 = 1.76;

        bandingkanBMI("Data 1", massaUdinData1, tinggiUdinData1, massaNanangData1, tinggiNanangData1);
        bandingkanBMI("Data 2", massaUdinData2, tinggiUdinData2, massaNanangData2, tinggiNanangData2);
    }

    public static double hitungBMI(double massa, double tinggi) {
        return massa / (tinggi * tinggi);
    }

    public static void bandingkanBMI(String PERBANDINGAN, double massaUdin, double tinggiUdin, double massaNanang, double tinggiNanang) {
        double bmiUdin = hitungBMI(massaUdin, tinggiUdin);
        double bmiNanang = hitungBMI(massaNanang, tinggiNanang);

        String BulatkanAngka = (bmiUdin > bmiNanang) ? "lebih tinggi dari Nanang" : "lebih rendah dari Nanang";

        System.out.println("Bmi Udin (" + String.format("%.1f", bmiUdin) + ") " + BulatkanAngka + " (" + String.format("%.1f", bmiNanang) + ")");
    }
}