JFLAGS = -g -encoding UTF8 
JC = javac

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	A.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
