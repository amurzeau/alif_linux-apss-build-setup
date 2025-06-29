# Copyright (C) 2022 Alif Semiconductor - All Rights Reserved.
# Use, distribution and modification of this code is permitted under the
# terms stated in the Alif Semiconductor Software License Agreement
#
# You should have received a copy of the Alif Semiconductor Software
# License Agreement with this file. If not, please write to:
# contact@alifsemi.com, or visit: https://alifsemi.com/license

LICENSE="MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://setup-network"
PV = "1.0"
S = "${WORKDIR}/"

DEPENDS += "update-rc.d-native"

do_configure[noexec] = "1"

do_compile[noexec] = "1"

do_install() {
    install -m 755 -D ${WORKDIR}/setup-network \
                      ${D}${sysconfdir}/init.d/setup-network
    install -d ${D}/etc/rcS.d/
    update-rc.d -r ${D} setup-network defaults
}


FILES_${PN} = "${sysconfdir}"
INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME_${PN} = "setup-network"
