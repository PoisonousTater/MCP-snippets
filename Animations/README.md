# What it does
  some person asked how to make the 1.7 animations toggle able
  
# How to use 
  download the Animations.java and put it in your mods folder it baseically an emty mod so yea
  
  then ctrl+shift+t ItemRenderer.java and in this make these changes:
  
  in the render item first person add the transform float as shown in the image (Main being your clients main java class where everthing inits)
  ![image](https://user-images.githubusercontent.com/92774577/153559612-7fd62bc1-4a21-48aa-b034-bbfdb8eb95b8.png)
  
  then
  
  Make these changes in the case BLOCK make the secong arg in this.transformFirstPersonItem your transform float and add this if statement after the this.transformFirstPersonItem     ```if(Main.INSTANCE.modManager.animations.enabled) {
                            	GlStateManager.translate(-0.5f, 0.2f, 0.0f);
                            }``` (again main being the main class of ur client)          do all this as shown in the image :)
  ![image](https://user-images.githubusercontent.com/92774577/153559833-7c833433-23be-461d-b951-22da207caebe.png)

  

