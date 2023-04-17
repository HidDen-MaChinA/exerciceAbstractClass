package com.devoir.prog3.AbstractClass;

import com.devoir.prog3.ConcreteDependencies.ConcreteDependence1;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractClass {
    public ConcreteDependence1 dep1;
    public ConcreteDependence1 dep2;
}
