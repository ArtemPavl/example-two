public class Main {
    public static void main(String[] args) {
        var weightFirstBoxer =  78.2;
        var weightSecondBoxer =  82.7;
        var weightTwoBoxers = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Вес обоих баксеров " + weightTwoBoxers + " кг!");

        var weightDifference = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница в весе " + weightDifference + " кг!");

        weightDifference = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Разница в весе " + weightDifference + " кг!");

        var timeWork = 64;
        var timeOneWorker = 8;
        var workers = timeWork / timeOneWorker;
        System.out.println("Всего работников в компании – " + workers + " человек");

        var workersAdd = 94;
        workers = workers + workersAdd;
        timeWork = timeOneWorker * workers;
        System.out.println("Если в компании работает " + workers + " человека, то всего " + timeWork + " часов работы может быть поделено между сотрудниками");
    }
}