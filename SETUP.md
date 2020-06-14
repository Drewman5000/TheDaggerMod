Here is how I set up my project using MacOS 10.14.16, Eclipse 2020-03 (4.15.0), gradle 6.4.1

To get rid of .DS_Store files:
find . -name '.DS_Store' -type f -delete
need to make a clean function that cd to dir and then runs that command.

Did above like this:
sudo nano .bash_profile
and added these lines:

mcdsclear() { 
        cd /Users/andrewhyland/Desktop/MinecraftMod/TheDaggerMod
        find . -name '.DS_Store' -type f -delete
}



The way I set up the minecraft modding.
I followed this youtube video with a few exceptions due to MacOS:
https://youtu.be/N9E1mf8LJXg

new video for version1.15.2 
https://www.youtube.com/watch?v=JOTH1eDP99Y
he uses intelliJ and I'm still setting up eclipse by the comment section and this document.

In the vid he has you get latest Forge mdk:
https://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.15.2.html

Then you get the compatible java jdk:
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
I got 1.8.0_251.jdk

Also get the Eclipse IDE:
https://www.eclipse.org/downloads/

Unzip the Forge mdk
Place all Forge files inside a folder that you will use for your modding.

for macOS I had to install gradle using homebrew:
https://docs.gradle.org/current/userguide/installation.html

> brew install gradle
> brew upgrade gradle
Verify installation
> gradle -v


Then you can navigate to your Modpack folder from within terminal
cd /Users/username/PathTo/MinecraftMod/TheDaggerMod

Then use the gradlew command:
./gradlew genEclipseRuns
./gradlew eclipse

to compile or decomp or whatever it does.

Then run eclipse as he says in the end of the first video. Custom workspace at the minecraft modding folder, then Open Prjects from File System and select your mod folder which should be just underneath that in the tree. i.e. /MinecraftModding/TheDaggerMod
MinecraftModding is the workspace folder and TheDaggerMod is the project folder. 

That will load in more files and directories from gradle and Eclipse including Test Mod etc.

Make sure to get rid of the example mod folders so the ./gradlew runClient will load properly. Otherwise I got a build error non zero exit value.
Update, runClient appears to work correctly now that I'm using updated Eclipse and gradle.
