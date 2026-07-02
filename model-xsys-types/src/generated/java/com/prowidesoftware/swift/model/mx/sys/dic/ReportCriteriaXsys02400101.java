
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for ReportCriteria complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportCriteria", propOrder = {
    "rptOptn",
    "rptGnrtnOptn",
    "svc",
    "tmRg",
    "thirdPartyDN"
})
public class ReportCriteriaXsys02400101 {

    @XmlElement(name = "RptOptn", required = true)
    protected String rptOptn;
    @XmlElement(name = "RptGnrtnOptn", required = true)
    protected String rptGnrtnOptn;
    @XmlElement(name = "Svc", required = true)
    protected String svc;
    @XmlElement(name = "TmRg")
    protected TimeRange tmRg;
    @XmlElement(name = "ThirdPartyDN", namespace = "urn:swift:snl:ns.Sw")
    protected String thirdPartyDN;

    /**
     * Gets the value of the rptOptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptOptn() {
        return rptOptn;
    }

    /**
     * Sets the value of the rptOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportCriteriaXsys02400101 setRptOptn(String value) {
        this.rptOptn = value;
        return this;
    }

    /**
     * Gets the value of the rptGnrtnOptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptGnrtnOptn() {
        return rptGnrtnOptn;
    }

    /**
     * Sets the value of the rptGnrtnOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportCriteriaXsys02400101 setRptGnrtnOptn(String value) {
        this.rptGnrtnOptn = value;
        return this;
    }

    /**
     * Gets the value of the svc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvc() {
        return svc;
    }

    /**
     * Sets the value of the svc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportCriteriaXsys02400101 setSvc(String value) {
        this.svc = value;
        return this;
    }

    /**
     * Gets the value of the tmRg property.
     * 
     * @return
     *     possible object is
     *     {@link TimeRange }
     *     
     */
    public TimeRange getTmRg() {
        return tmRg;
    }

    /**
     * Sets the value of the tmRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeRange }
     *     
     */
    public ReportCriteriaXsys02400101 setTmRg(TimeRange value) {
        this.tmRg = value;
        return this;
    }

    /**
     * ThirdPartyDN
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyDN() {
        return thirdPartyDN;
    }

    /**
     * Sets the value of the thirdPartyDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportCriteriaXsys02400101 setThirdPartyDN(String value) {
        this.thirdPartyDN = value;
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
