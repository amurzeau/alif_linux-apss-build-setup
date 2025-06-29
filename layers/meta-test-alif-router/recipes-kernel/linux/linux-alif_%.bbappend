FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"
SRC_URI_append += "file://nftables.cfg file://no_ext4.cfg file://quiet-printk.cfg"
