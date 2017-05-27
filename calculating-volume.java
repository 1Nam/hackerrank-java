class Calculate {
    Scanner sc = new Scanner(System.in);
    Output output = new Output();
    int get_int_val() throws NumberFormatException, IOException {
        int value = sc.nextInt();
        if (value <= 0) {
			throwNumberFormatException();
		}
        return value;
    }
    
    double get_double_val() throws NumberFormatException, IOException {
        double value = sc.nextDouble();
        if(value <= 0) {
			throwNumberFormatException();
        }
        return value;
    }
    
    void throwNumberFormatException() {
		throw new NumberFormatException("All the values must be positive");
    }
    
    static Volume do_calc() {
        return new Volume();
    }
}
    
class Volume {
    double get_volume (int a) {
        return a*a*a;
    }
    
    double get_volume (int l, int b, int h) {
        return l*b*h;
    }
        
    double get_volume (double r) {
        return (2.0 / 3 * Math.PI * r * r * r);
    }
    
    double get_volume (double r, double h) {
        return (Math.PI * r * r * h);
    }
}

class Output {
    void display (double volume) {
        System.out.printf("%.3f\n", volume);
    }
}
