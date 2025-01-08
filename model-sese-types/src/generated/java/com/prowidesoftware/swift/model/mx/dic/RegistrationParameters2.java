
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to registration of securities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationParameters2", propOrder = {
    "certfctnId",
    "certfctnDtTm",
    "regarAcct",
    "certNb"
})
public class RegistrationParameters2 {

    @XmlElement(name = "CertfctnId")
    protected String certfctnId;
    @XmlElement(name = "CertfctnDtTm")
    protected DateAndDateTimeChoice certfctnDtTm;
    @XmlElement(name = "RegarAcct")
    protected String regarAcct;
    @XmlElement(name = "CertNb")
    protected List<SecuritiesCertificate2> certNb;

    /**
     * Gets the value of the certfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertfctnId() {
        return certfctnId;
    }

    /**
     * Sets the value of the certfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegistrationParameters2 setCertfctnId(String value) {
        this.certfctnId = value;
        return this;
    }

    /**
     * Gets the value of the certfctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getCertfctnDtTm() {
        return certfctnDtTm;
    }

    /**
     * Sets the value of the certfctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public RegistrationParameters2 setCertfctnDtTm(DateAndDateTimeChoice value) {
        this.certfctnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the regarAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegarAcct() {
        return regarAcct;
    }

    /**
     * Sets the value of the regarAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegistrationParameters2 setRegarAcct(String value) {
        this.regarAcct = value;
        return this;
    }

    /**
     * Gets the value of the certNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesCertificate2 }
     * 
     * 
     * @return
     *     The value of the certNb property.
     */
    public List<SecuritiesCertificate2> getCertNb() {
        if (certNb == null) {
            certNb = new ArrayList<>();
        }
        return this.certNb;
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
     * Adds a new item to the certNb list.
     * @see #getCertNb()
     * 
     */
    public RegistrationParameters2 addCertNb(SecuritiesCertificate2 certNb) {
        getCertNb().add(certNb);
        return this;
    }

}
