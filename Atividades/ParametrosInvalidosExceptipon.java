package Atividades;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo paramentro tem um valor inferior ao do primeiro parametro!");
    }
}