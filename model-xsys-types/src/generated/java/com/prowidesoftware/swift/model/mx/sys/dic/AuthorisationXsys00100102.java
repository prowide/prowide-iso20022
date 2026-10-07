
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.sys.dic.SwAny;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for Authorisation complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authorisation", propOrder = {
    "snFRef",
    "copySnFRef",
    "service",
    "thirdPartyToReceiverInformation",
    "thirdPartyToSenderInformation",
    "thirdPartyRefusalReason",
    "signatureValue",
    "xtnsn"
})
public class AuthorisationXsys00100102
    extends AbstractAuthorisation
{

    @XmlElement(name = "SnFRef", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String snFRef;
    @XmlElement(name = "CopySnFRef", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String copySnFRef;
    @XmlElement(name = "Service", namespace = "urn:swift:snl:ns.SwInt", required = true)
    protected String service;
    @XmlElement(name = "ThirdPartyToReceiverInformation", namespace = "urn:swift:snl:ns.Sw")
    protected SwAny thirdPartyToReceiverInformation;
    @XmlElement(name = "ThirdPartyToSenderInformation", namespace = "urn:swift:snl:ns.Sw")
    protected SwAny thirdPartyToSenderInformation;
    @XmlElement(name = "ThirdPartyRefusalReason", namespace = "urn:swift:snl:ns.Sw")
    protected SwAny thirdPartyRefusalReason;
    @XmlElement(name = "SignatureValue", namespace = "urn:swift:snl:ns.SwSec")
    protected String signatureValue;
    @XmlElement(name = "Xtnsn")
    protected List<Extension> xtnsn;

    /**
     * SnFRef
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFRef() {
        return snFRef;
    }

    /**
     * Sets the value of the snFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuthorisationXsys00100102 setSnFRef(String value) {
        this.snFRef = value;
        return this;
    }

    /**
     * CopySnFRef
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopySnFRef() {
        return copySnFRef;
    }

    /**
     * Sets the value of the copySnFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuthorisationXsys00100102 setCopySnFRef(String value) {
        this.copySnFRef = value;
        return this;
    }

    /**
     * Service
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuthorisationXsys00100102 setService(String value) {
        this.service = value;
        return this;
    }

    /**
     * ThirdPartyToReceiverInformation
     * 
     * @return
     *     possible object is
     *     {@link SwAny }
     *     
     */
    public SwAny getThirdPartyToReceiverInformation() {
        return thirdPartyToReceiverInformation;
    }

    /**
     * Sets the value of the thirdPartyToReceiverInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAny }
     *     
     */
    public AuthorisationXsys00100102 setThirdPartyToReceiverInformation(SwAny value) {
        this.thirdPartyToReceiverInformation = value;
        return this;
    }

    /**
     * ThirdPartyToSenderInformation
     * 
     * @return
     *     possible object is
     *     {@link SwAny }
     *     
     */
    public SwAny getThirdPartyToSenderInformation() {
        return thirdPartyToSenderInformation;
    }

    /**
     * Sets the value of the thirdPartyToSenderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAny }
     *     
     */
    public AuthorisationXsys00100102 setThirdPartyToSenderInformation(SwAny value) {
        this.thirdPartyToSenderInformation = value;
        return this;
    }

    /**
     * ThirdPartyRefusalReason
     * 
     * @return
     *     possible object is
     *     {@link SwAny }
     *     
     */
    public SwAny getThirdPartyRefusalReason() {
        return thirdPartyRefusalReason;
    }

    /**
     * Sets the value of the thirdPartyRefusalReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAny }
     *     
     */
    public AuthorisationXsys00100102 setThirdPartyRefusalReason(SwAny value) {
        this.thirdPartyRefusalReason = value;
        return this;
    }

    /**
     * SignatureValue
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureValue() {
        return signatureValue;
    }

    /**
     * Sets the value of the signatureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuthorisationXsys00100102 setSignatureValue(String value) {
        this.signatureValue = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
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
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public AuthorisationXsys00100102 addXtnsn(Extension xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
