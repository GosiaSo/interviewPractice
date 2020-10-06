package pl.sobocinska.car;

//    W istniejącej klasie Car utwórz statyczną metodę przyjmującą tablicę obiektów klasy Car i zwracającą największy obiekt tej tablicy.
//    Obiekt Car jest większy od drugiego obiektu jeśli jego maxSpeed jest większa. Jeśli maxSpeed są równe większy jest ten obiekt, którego accelleration jest większe.
//    W przypadku, kiedy wejściowa tablica jest pusta, wyrzuć wyjątek typu IllegalStateException z informacją "Bad array size".

public class Car implements Comparable<Car>{

    public static Car getMax(Car[] cars) throws Exception {

        if(cars.length == 0){
            throw new Exception();
        }

        Car max = cars[0];
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].compareTo(max) > 0){
                max = cars[i];
            }
        }
        return max;
    }

    @Override
    public int compareTo(Car o) {
        int result = this.maxSpeed - o.maxSpeed;
        if(result == 0){
            return this.accelleration - o.accelleration;
        }
        return result;
    }

    int maxSpeed;
    int accelleration;

    public Car(int maxSpeed, int accelleration) {
        this.maxSpeed = maxSpeed;
        this.accelleration = accelleration;
    }

    @Override
    public String toString() {
        return "Car with maxSpeed=" + maxSpeed + " and accelleration=" + accelleration;
    }

}

