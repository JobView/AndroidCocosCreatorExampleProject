LOCAL_PATH :=$(call my-dir)

APP_PLATFORM := android-21
$(call import-add-path,  $(LOCAL_PATH)/../../../../cocos2d-x)
$(call import-add-path,  $(LOCAL_PATH)/../../../../cocos2d-x/cocos)
$(call import-add-path,  $(LOCAL_PATH)/../../../../cocos2d-x/external)
include $(LOCAL_PATH)/../../jni/CocosAndroid.mk

