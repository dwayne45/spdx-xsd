<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:exsl="http://exslt.org/common" xmlns:xs="http://www.w3.org/2001/XMLSchema" exclude-result-prefixes="xs" version="1.0">
    <xsl:output method="text" indent="yes"/>

    <xsl:include href="./../../../../xml/xsl/go-gen.xsl"/>

    <!-- 
    input: ${pdu}/spdx-xsd/IEPD/spdx-license/xml/xsd/spdx-license-iep.xsd
    output:${pdu}/spdx-xsd/src/spdx-license/spdx-license-struct.go
   -->

    <xsl:template match="/">
        <xsl:call-template name="makego"/>
    </xsl:template>

</xsl:stylesheet>
