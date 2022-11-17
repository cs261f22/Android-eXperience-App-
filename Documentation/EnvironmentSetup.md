# How to Properly Setup an Environment

In order to setup an environment to build, test, and run our code, one should download and install Android Studio on their device. The following link is where one
should begin this process: https://developer.android.com/studio/. (All of the default settings in the Setup Wizard should work fine for the purposes of this project.)
Then, one should proceed by cloning this repository on their machine and opening up Android Studio (if it is not open already). Following these steps, one should
open up their cloned copy of the project in Android Studio by clicking on File -> Open in Android Studio and then selecting the project (as seen by the green icon in 
Android Studio in the directory containing the project). Click on the project and then select "Open" in order to access the project locally.

To push changes back to the main repository, one can either push directly to the main repository (particularly if one is working individually), or, alternatively,
one can fork this repository, create a branch to do work in on their machine, push the branch containing local changes to one's fork, and then make a pull request
asking that the changes made in one's fork be merged back into the main repository. One will need to approve the pull request (or have someone else fulfill this step)
in order for any changes to be merged back into the main repository.  If there are other individuals working on the project, everyone except the person who pushed
new code into the main repository should sync their fork by clicking on the "Sync Fork" icon in GitHub and then typing the command "git pull" into the terminal on 
their respective devices. Adhering to these steps should provide one with an up-to-date version of the repository on their local device.
