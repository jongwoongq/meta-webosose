# Copyright (c) 2018 LG Electronics, Inc.

SUMMARY = "Memory Manager"
AUTHOR = "Sangwoo Kang <sangwoo82.kang@lge.com>"
SECTION = "webos/base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = "glib-2.0 luna-service2 libpbnjson pmloglib procps"

WEBOS_VERSION = "1.0.0-2_3f4ad90b9c524ceb31eaa15cf9ee8c5365443046"
PR = "r0"

inherit webos_component
inherit webos_cmake
inherit webos_enhanced_submissions
inherit webos_daemon
inherit webos_system_bus
inherit webos_public_repo

SRC_URI = "${WEBOSOSE_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"
