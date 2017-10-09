AutoLoginClient for FDU

Author : Applepleple

Email : wlzxcwork@163.com

This is a maven project developed with intellij.

The project uses a open source browser to login FDU network authentication platform automatically.
To use this project, you need to have a FDU UIS account and your machine needs java environment to run the code.

1) Get the source code

git clone https://github.com/Applepleple/FDUAutoLoginClient.git

2) Compile the code

mvn install

or you could get the jar file from http://pan.baidu.com/s/1c1DW95A directly

3) Launch the process

java -jar autologin.client-1.0-SNAPSHOT.jar for login once

java -jar autologin.client-1.0-SNAPSHOT.jar -a for login automatically every day at 4 am.
