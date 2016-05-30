# Junior Automation Program

---

## Environment setup

### Java
1. Download and install Java SE Development Kit (JDK)
  - URL: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
  - Click on the _'Accept License Agreement'_ radio button
  - Select _'Windows x86'_ or _'Windows x64'_ (depends on your PC)

2. Set JAVA_HOME environment variable
  - Right click on Computer and select Properties
  - Click on Advanced system settings (left menu panel)
  - Click on Environment Variables button
  - Click on New button (System variables section)
    - Variable name: JAVA_HOME
    - Variable value: location of the installed JDK, e.g. C:\Program Files\Java\jdk1.8.0_91
  - Extend _Path_ system variable with ;%JAVA_HOME%\bin

### Git
- Download and install Git
  - URL: https://git-scm.com/download/win
  - Do not modify anything during the installation, default configuration should be enough

### Eclipse
- Download Eclipse (current version is Mars2)
  - URL: http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/mars2
  - Select _'Windows 32-bit'_ or _'Windows 64-bit'_ (depends on your PC) from the _'Download Links'_ (right side)
  - Click on the orange _'DOWNLOAD'_ button (left side)
- Extract to _'D:\EPAM'_ folder (or _'C:\EPAM'_ if you have no D:\ partition)
- At this point you have the _'D:\EPAM\eclipse'_ folder structure


---

## Cloning the Git repository
- Create Git workspace:
  - Create _'D:\EPAM\workspace\git'_ folder structure (or _'C:\EPAM\workspace\git'_ if you have no D:\ partition)
- Open the created _'git'_ folder, right click and select _'Git Bash Here'_
- Copy the _'git clone https://github.com/tcsako/Junior-Automation-Program.git'_ command to the terminal window
- Hit _Enter_

---

## Eclipse setup
- Create Eclipse workspace:
  - Create _'D:\EPAM\workspace\eclipse'_ folder structure (or _'C:\EPAM\workspace\eclipse'_ if you have no D:\ partition)
- Start Eclipse (double click on _eclipse.exe_ under _D:\EPAM\eclipse_)
- In the _Workspace Launcer_ window click on the _Browse..._ button and select the previously created _'D:\EPAM\workspace\eclipse'_ folder (be careful, __do not use D:\EPAM\eclipse as workspace folder!__)
- Click on the _OK_ button
- Close the _Welcome_ window
- Select _File -> Import... -> Maven -> Existing Maven Projects_
- Click on the _Next_ button
- Click on the _Browse..._ button and select _'D:\EPAM\workspace\git\Junior-Automation-Program'_
- Click on the _OK_ button
- Make sure that _/pom.xml_ is checked
- Click on the _Finish_ button (this could take awhile, you can see the progress in the bottom right corner)
