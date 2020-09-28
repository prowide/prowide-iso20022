
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information of the certificate to create.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificationRequest2", propOrder = {
    "vrsn",
    "sbjtNm",
    "sbjtPblcKeyInf",
    "attr"
})
public class CertificationRequest2 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "SbjtNm")
    protected CertificateIssuer1 sbjtNm;
    @XmlElement(name = "SbjtPblcKeyInf", required = true)
    protected PublicRSAKey2 sbjtPblcKeyInf;
    @XmlElement(name = "Attr", required = true)
    protected List<RelativeDistinguishedName2> attr;

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CertificationRequest2 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the sbjtNm property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateIssuer1 }
     *     
     */
    public CertificateIssuer1 getSbjtNm() {
        return sbjtNm;
    }

    /**
     * Sets the value of the sbjtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateIssuer1 }
     *     
     */
    public CertificationRequest2 setSbjtNm(CertificateIssuer1 value) {
        this.sbjtNm = value;
        return this;
    }

    /**
     * Gets the value of the sbjtPblcKeyInf property.
     * 
     * @return
     *     possible object is
     *     {@link PublicRSAKey2 }
     *     
     */
    public PublicRSAKey2 getSbjtPblcKeyInf() {
        return sbjtPblcKeyInf;
    }

    /**
     * Sets the value of the sbjtPblcKeyInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicRSAKey2 }
     *     
     */
    public CertificationRequest2 setSbjtPblcKeyInf(PublicRSAKey2 value) {
        this.sbjtPblcKeyInf = value;
        return this;
    }

    /**
     * Gets the value of the attr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelativeDistinguishedName2 }
     * 
     * 
     */
    public List<RelativeDistinguishedName2> getAttr() {
        if (attr == null) {
            attr = new ArrayList<RelativeDistinguishedName2>();
        }
        return this.attr;
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

    /**
     * Adds a new item to the attr list.
     * @see #getAttr()
     * 
     */
    public CertificationRequest2 addAttr(RelativeDistinguishedName2 attr) {
        getAttr().add(attr);
        return this;
    }

}
