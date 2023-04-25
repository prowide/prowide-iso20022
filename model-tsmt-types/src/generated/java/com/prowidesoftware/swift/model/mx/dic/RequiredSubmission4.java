
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the details relative to the submission of the certificate data set.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredSubmission4", propOrder = {
    "submitr",
    "certTp",
    "mtchIssr",
    "mtchIsseDt",
    "mtchInspctnDt",
    "authrsdInspctrInd",
    "mtchConsgn",
    "mtchManfctr",
    "lineItmId"
})
public class RequiredSubmission4 {

    @XmlElement(name = "Submitr", required = true)
    protected List<BICIdentification1> submitr;
    @XmlElement(name = "CertTp", required = true)
    @XmlSchemaType(name = "string")
    protected TradeCertificateType1Code certTp;
    @XmlElement(name = "MtchIssr")
    protected PartyIdentification27 mtchIssr;
    @XmlElement(name = "MtchIsseDt")
    protected boolean mtchIsseDt;
    @XmlElement(name = "MtchInspctnDt")
    protected boolean mtchInspctnDt;
    @XmlElement(name = "AuthrsdInspctrInd")
    protected boolean authrsdInspctrInd;
    @XmlElement(name = "MtchConsgn")
    protected boolean mtchConsgn;
    @XmlElement(name = "MtchManfctr")
    protected PartyIdentification27 mtchManfctr;
    @XmlElement(name = "LineItmId")
    protected List<String> lineItmId;

    /**
     * Gets the value of the submitr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the submitr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the submitr property.
     */
    public List<BICIdentification1> getSubmitr() {
        if (submitr == null) {
            submitr = new ArrayList<>();
        }
        return this.submitr;
    }

    /**
     * Gets the value of the certTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCertificateType1Code }
     *     
     */
    public TradeCertificateType1Code getCertTp() {
        return certTp;
    }

    /**
     * Sets the value of the certTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCertificateType1Code }
     *     
     */
    public RequiredSubmission4 setCertTp(TradeCertificateType1Code value) {
        this.certTp = value;
        return this;
    }

    /**
     * Gets the value of the mtchIssr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification27 }
     *     
     */
    public PartyIdentification27 getMtchIssr() {
        return mtchIssr;
    }

    /**
     * Sets the value of the mtchIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification27 }
     *     
     */
    public RequiredSubmission4 setMtchIssr(PartyIdentification27 value) {
        this.mtchIssr = value;
        return this;
    }

    /**
     * Gets the value of the mtchIsseDt property.
     * 
     */
    public boolean isMtchIsseDt() {
        return mtchIsseDt;
    }

    /**
     * Sets the value of the mtchIsseDt property.
     * 
     */
    public RequiredSubmission4 setMtchIsseDt(boolean value) {
        this.mtchIsseDt = value;
        return this;
    }

    /**
     * Gets the value of the mtchInspctnDt property.
     * 
     */
    public boolean isMtchInspctnDt() {
        return mtchInspctnDt;
    }

    /**
     * Sets the value of the mtchInspctnDt property.
     * 
     */
    public RequiredSubmission4 setMtchInspctnDt(boolean value) {
        this.mtchInspctnDt = value;
        return this;
    }

    /**
     * Gets the value of the authrsdInspctrInd property.
     * 
     */
    public boolean isAuthrsdInspctrInd() {
        return authrsdInspctrInd;
    }

    /**
     * Sets the value of the authrsdInspctrInd property.
     * 
     */
    public RequiredSubmission4 setAuthrsdInspctrInd(boolean value) {
        this.authrsdInspctrInd = value;
        return this;
    }

    /**
     * Gets the value of the mtchConsgn property.
     * 
     */
    public boolean isMtchConsgn() {
        return mtchConsgn;
    }

    /**
     * Sets the value of the mtchConsgn property.
     * 
     */
    public RequiredSubmission4 setMtchConsgn(boolean value) {
        this.mtchConsgn = value;
        return this;
    }

    /**
     * Gets the value of the mtchManfctr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification27 }
     *     
     */
    public PartyIdentification27 getMtchManfctr() {
        return mtchManfctr;
    }

    /**
     * Sets the value of the mtchManfctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification27 }
     *     
     */
    public RequiredSubmission4 setMtchManfctr(PartyIdentification27 value) {
        this.mtchManfctr = value;
        return this;
    }

    /**
     * Gets the value of the lineItmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lineItmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the lineItmId property.
     */
    public List<String> getLineItmId() {
        if (lineItmId == null) {
            lineItmId = new ArrayList<>();
        }
        return this.lineItmId;
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
     * Adds a new item to the submitr list.
     * @see #getSubmitr()
     * 
     */
    public RequiredSubmission4 addSubmitr(BICIdentification1 submitr) {
        getSubmitr().add(submitr);
        return this;
    }

    /**
     * Adds a new item to the lineItmId list.
     * @see #getLineItmId()
     * 
     */
    public RequiredSubmission4 addLineItmId(String lineItmId) {
        getLineItmId().add(lineItmId);
        return this;
    }

}
