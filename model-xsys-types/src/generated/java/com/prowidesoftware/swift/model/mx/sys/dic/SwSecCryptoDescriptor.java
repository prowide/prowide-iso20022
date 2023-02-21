
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for CryptoDescriptor complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoDescriptor", namespace = "urn:swift:snl:ns.SwSec", propOrder = {
    "memberRef",
    "encryptDN",
    "signDN",
    "certPolicyId"
})
public class SwSecCryptoDescriptor {

    @XmlElement(name = "MemberRef")
    protected List<String> memberRef;
    @XmlElement(name = "EncryptDN")
    protected String encryptDN;
    @XmlElement(name = "SignDN")
    protected String signDN;
    @XmlElement(name = "CertPolicyId")
    protected String certPolicyId;

    /**
     * Gets the value of the memberRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMemberRef() {
        if (memberRef == null) {
            memberRef = new ArrayList<String>();
        }
        return this.memberRef;
    }

    /**
     * Gets the value of the encryptDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptDN() {
        return encryptDN;
    }

    /**
     * Sets the value of the encryptDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSecCryptoDescriptor setEncryptDN(String value) {
        this.encryptDN = value;
        return this;
    }

    /**
     * Gets the value of the signDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignDN() {
        return signDN;
    }

    /**
     * Sets the value of the signDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSecCryptoDescriptor setSignDN(String value) {
        this.signDN = value;
        return this;
    }

    /**
     * Gets the value of the certPolicyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertPolicyId() {
        return certPolicyId;
    }

    /**
     * Sets the value of the certPolicyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSecCryptoDescriptor setCertPolicyId(String value) {
        this.certPolicyId = value;
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
     * Adds a new item to the memberRef list.
     * @see #getMemberRef()
     * 
     */
    public SwSecCryptoDescriptor addMemberRef(String memberRef) {
        getMemberRef().add(memberRef);
        return this;
    }

}
