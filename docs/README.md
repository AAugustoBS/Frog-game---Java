# LDTS2208


## LDTS_<T><G> - <Frogger>



**Example**:

In this game, a frog tries to cross a river to save its children on the other side.The problem is the water is getting faster and faster. and there are crocodiles (which might eat the frog). Therefore, the frog has a great challenge. But every time a frog saves the child across the river. Another son appears on the side of another river

This project was developed by *Antonio Augusto Brito de Sousa* (*up202000705*@fe.up.pt)  for LDTS 2022⁄23.

### IMPLEMENTED FEATURES or CANCELED FEATURES
- This section show the **Canceled Features** because the short time compatible to work and **Implemented Features**.
#### Canceled Features
 - **Ranking board** - the game has a ranking board with the best scores of another player.
 - **speed increment** - When the frog reach the other side of the river, the water speed is incremented, what is more difficult for the frog.
 - **Getting extra lifes** - Sometimes there are medicines on top of tree trunks.
 
#### Implemented Features
- **Move** - the up key moves forward and the down key backwards, as well as left and right.
- **Waterfall** - When the frog touch the left side of the screen, he falls into the waterfall and loses a life.
- **Murderers Crocodile** - When the frog touch a Crocodile, he loss a life.
- **Water Flow** - The water has a flow pushing to the left side of screen(Waterfall's direction), so, if the frog dont move to the right direction, he could be dead in a little bit of seconds.
 
- **Touch the little Frog to win** - When the big Frog touch the little one, the game's finish and then the main menu appear.
 
 ### DESIGN
 
 ### General Structure
 
 #### Problem in Context:
   The main concern of the project was how to automate and synchronize all game elements (frog, water and game commands) without a lot of **While loop** depending of states in very deep classes. Two main patterns were applied to the project, the **Model-View-Control Pattern_**, which is commonly used in a GUI and the **_State Pattern_**

#### Model-View-Control:
 The ease of using MVC lies in the separation of Model(data), Control(logic) and view(gui side).

#### Implementation:
 For the implementation they were focused on 4 main elements: Game, Menu, River and Frogger. That they are the only ones to have the complete MVC, and the Game inherits the characteristic of the River in the Controller. For the Model, all elements of the game that could store values were used. A Model named Objecto is created, which generates an inheritance for all other models outside the fantastic quartet above. Finally, all models have a View that is responsible for designing the model, in addition to making a direct connection with Lanterna's Package through the package gui.
 
 <img src="docs/img/MVC.png"/>

#### THE JUMP ACTION OF THE KANGAROOBOY SHOULD BEHAVE DIFFERENTLY DEPENDING ON ITS STATE

**Problem in Context**

There was a lot of scattered conditional logic when deciding how the KangarooBoy should behave when jumping, as the jumps should be different depending on the items that came to his possession during the game (an helix will alow him to fly, driking a potion will allow him to jump double the height, etc.). This is a violation of the **Single Responsability Principle**. We could concentrate all the conditional logic in the same method to circumscribe the issue to that one method but the **Single Responsability Principle** would still be violated.

**The Pattern**

We have applied the **State** pattern. This pattern allows you to represent different states with different subclasses. We can switch to a different state of the application by switching to another implementation (i.e., another subclass). This pattern allowed to address the identified problems because […].

**Implementation**

The following figure shows how the pattern’s roles were mapped to the application classes.

![img](https://www.fe.up.pt/~arestivo/page/img/examples/lpoo/state.svg)

These classes can be found in the following files:

- [Character](https://web.fe.up.pt/~arestivo/page/courses/2021/lpoo/template/src/main/java/Character.java)
- [JumpAbilityState](https://web.fe.up.pt/~arestivo/page/courses/2021/lpoo/template/src/main/java/JumpAbilityState.java)
- [DoubleJumpState](https://web.fe.up.pt/~arestivo/page/courses/2021/lpoo/template/src/main/java/DoubleJumpState.java)
- [HelicopterState](https://web.fe.up.pt/~arestivo/page/courses/2021/lpoo/template/src/main/java/HelicopterState.java)
- [IncreasedGravityState](https://web.fe.up.pt/~arestivo/page/courses/2021/lpoo/template/src/main/java/IncreasedGravityState.java)

**Consequences**

The use of the State Pattern in the current design allows the following benefits:

- The several states that represent the character’s hability to jump become explicit in the code, instead of relying on a series of flags.
- We don’t need to have a long set of conditional if or switch statements associated with the various states; instead, polimorphism is used to activate the right behavior.
- There are now more classes and instances to manage, but still in a reasonable number.

#### KNOWN CODE SMELLS AND REFACTORING SUGGESTIONS

> This section should describe 3 to 5 different code smells that you have identified in your current implementation, and suggest ways in which the code could be refactored to eliminate them. Each smell and refactoring suggestions should be described in its own subsection.

**Example of such a subsection**:

------

#### DATA CLASS

The `PlatformSegment` class is a **Data Class**, as it contains only fields, and no behavior. This is problematic because […].

A way to improve the code would be to move the `isPlatformSegmentSolid()` method to the `PlatformSegment` class, as this logic is purely concerned with the `PlatformSegment` class.

### TESTING

- Screenshot of coverage report.
- Link to mutation testing report.

### SELF-EVALUATION

> In this section describe how the work regarding the project was divided between the students. In the event that members of the group do not agree on a work distribution, the group should send an email to the teacher explaining the disagreement.

**Example**:

- John Doe: 40%

 

