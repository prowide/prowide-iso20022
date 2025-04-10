
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information regarding corporate action option details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOptionSD4", propOrder = {
    "plcAndNm",
    "xtndedOptnFeatrs",
    "issrSpprtdFlg",
    "dtcTaxCtrlNbReqrdFlg"
})
public class CorporateActionOptionSD4 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "XtndedOptnFeatrs")
    @XmlSchemaType(name = "string")
    protected ExtendedOptionFeature1Code xtndedOptnFeatrs;
    @XmlElement(name = "IssrSpprtdFlg")
    protected Boolean issrSpprtdFlg;
    @XmlElement(name = "DTCTaxCtrlNbReqrdFlg")
    protected Boolean dtcTaxCtrlNbReqrdFlg;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionOptionSD4 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the xtndedOptnFeatrs property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedOptionFeature1Code }
     *     
     */
    public ExtendedOptionFeature1Code getXtndedOptnFeatrs() {
        return xtndedOptnFeatrs;
    }

    /**
     * Sets the value of the xtndedOptnFeatrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedOptionFeature1Code }
     *     
     */
    public CorporateActionOptionSD4 setXtndedOptnFeatrs(ExtendedOptionFeature1Code value) {
        this.xtndedOptnFeatrs = value;
        return this;
    }

    /**
     * Gets the value of the issrSpprtdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIssrSpprtdFlg() {
        return issrSpprtdFlg;
    }

    /**
     * Sets the value of the issrSpprtdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOptionSD4 setIssrSpprtdFlg(Boolean value) {
        this.issrSpprtdFlg = value;
        return this;
    }

    /**
     * Gets the value of the dtcTaxCtrlNbReqrdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDTCTaxCtrlNbReqrdFlg() {
        return dtcTaxCtrlNbReqrdFlg;
    }

    /**
     * Sets the value of the dtcTaxCtrlNbReqrdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOptionSD4 setDTCTaxCtrlNbReqrdFlg(Boolean value) {
        this.dtcTaxCtrlNbReqrdFlg = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
