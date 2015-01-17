SRCREV = "9301f9aff699bc90c194e41c3fa6117a36c4954a"
SRC_URI = "git://github.com/raspberrypi/linux.git;protocol=git;branch=rpi-3.12.y \
           file://sl030raspberrypii2ckernel.patch \
          "

require linux-raspberrypi.inc
