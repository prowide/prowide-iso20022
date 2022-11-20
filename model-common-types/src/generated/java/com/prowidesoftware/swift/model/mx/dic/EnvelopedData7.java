
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
 * Encrypted data with encryption key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopedData7", propOrder = {
    "vrsn",
    "orgtrInf",
    "rcpt",
    "ncrptdCntt"
})
public class EnvelopedData7 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "OrgtrInf")
    protected OriginatorInformation1 orgtrInf;
    @XmlElement(name = "Rcpt", required = true)
    protected List<Recipient8Choice> rcpt;
    @XmlElement(name = "NcrptdCntt")
    protected EncryptedContent6 ncrptdCntt;

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
    public EnvelopedData7 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the orgtrInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorInformation1 }
     *     
     */
    public OriginatorInformation1 getOrgtrInf() {
        return orgtrInf;
    }

    /**
     * Sets the value of the orgtrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorInformation1 }
     *     
     */
    public EnvelopedData7 setOrgtrInf(OriginatorInformation1 value) {
        this.orgtrInf = value;
        return this;
    }

    /**
     * Gets the value of the rcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Recipient8Choice }
     * 
     * 
     */
    public List<Recipient8Choice> getRcpt() {
        if (rcpt == null) {
            rcpt = new ArrayList<Recipient8Choice>();
        }
        return this.rcpt;
    }

    /**
     * Gets the value of the ncrptdCntt property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedContent6 }
     *     
     */
    public EncryptedContent6 getNcrptdCntt() {
        return ncrptdCntt;
    }

    /**
     * Sets the value of the ncrptdCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedContent6 }
     *     
     */
    public EnvelopedData7 setNcrptdCntt(EncryptedContent6 value) {
        this.ncrptdCntt = value;
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

    /**
     * Adds a new item to the rcpt list.
     * @see #getRcpt()
     * 
     */
    public EnvelopedData7 addRcpt(Recipient8Choice rcpt) {
        getRcpt().add(rcpt);
        return this;
    }

}
