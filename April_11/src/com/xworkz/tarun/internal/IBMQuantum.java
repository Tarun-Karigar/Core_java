package com.xworkz.tarun.internal;

class IBMQuantum extends QuantumComputer {
    @Override
    public void compute() {
        System.out.println("IBM Quantum is performing a quantum algorithm.");
    }

    public void entangleQubits() {
        System.out.println("Qubits are entangled for parallel processing.");
    }
}