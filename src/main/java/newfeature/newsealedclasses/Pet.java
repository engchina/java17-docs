package newfeature.newsealedclasses;

import java.awt.event.PaintEvent;

public abstract sealed class Pet {
    permits Dog, Cat {}
}

final class Dog extends Pet{

}

final class Cat extends Pet{

}
