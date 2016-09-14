Programming to interfaces
=========================


Applications should be build to anticipate ever changing needs.

The functionality usually remain the same, but the finer , concrete steps on how the
functionality works is the one that is poised to change.

That's why, to develop an application to always take care of such situations, it is good
to program to a generic interface, and leave out concrete implementation details.

At design stage, it's good to dissect your application into two parts:

    - Fixed parts -

These are static components that will remain the same under all situations

    - Variable parts -

These are parts that will change. Pointing them out at the very stages and developing
your application to ensure they are well addressed is the crux to building stable applications that can easily accommodate the ever changing user requirements.

Many design patterns and principles all try to provide ways to address this.
One way to address this is to always program to an interface



Scenario
========

Consider a display module of a computer system.

The display module should be flexible enough to allow for different display screens at runtime. It should allow
display to be done on a screen, projector, tv via HDMI etc etc.

Display module can be thought of a strategy and the client can change the strategy at runtime, to either screen, projector, tv screen etc.



Example in ```computer.java``` tries to implement this strategy.


