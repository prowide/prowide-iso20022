
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
 * Provides information about the beneficial owner of the securities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification50", propOrder = {
    "ownrId",
    "altrnId",
    "dmclCtry",
    "nonDmclCtry",
    "owndSctiesQty",
    "certfctnTp",
    "dclrtnDtls"
})
public class PartyIdentification50 {

    @XmlElement(name = "OwnrId", required = true)
    protected PartyIdentification48Choice ownrId;
    @XmlElement(name = "AltrnId")
    protected List<AlternatePartyIdentification2> altrnId;
    @XmlElement(name = "DmclCtry")
    protected String dmclCtry;
    @XmlElement(name = "NonDmclCtry")
    protected List<String> nonDmclCtry;
    @XmlElement(name = "OwndSctiesQty", required = true)
    protected FinancialInstrumentQuantity1Choice owndSctiesQty;
    @XmlElement(name = "CertfctnTp")
    protected List<BeneficiaryCertificationType2Choice> certfctnTp;
    @XmlElement(name = "DclrtnDtls")
    protected String dclrtnDtls;

    /**
     * Gets the value of the ownrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification48Choice }
     *     
     */
    public PartyIdentification48Choice getOwnrId() {
        return ownrId;
    }

    /**
     * Sets the value of the ownrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification48Choice }
     *     
     */
    public PartyIdentification50 setOwnrId(PartyIdentification48Choice value) {
        this.ownrId = value;
        return this;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altrnId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrnId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternatePartyIdentification2 }
     * 
     * 
     */
    public List<AlternatePartyIdentification2> getAltrnId() {
        if (altrnId == null) {
            altrnId = new ArrayList<AlternatePartyIdentification2>();
        }
        return this.altrnId;
    }

    /**
     * Gets the value of the dmclCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmclCtry() {
        return dmclCtry;
    }

    /**
     * Sets the value of the dmclCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification50 setDmclCtry(String value) {
        this.dmclCtry = value;
        return this;
    }

    /**
     * Gets the value of the nonDmclCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonDmclCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonDmclCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNonDmclCtry() {
        if (nonDmclCtry == null) {
            nonDmclCtry = new ArrayList<String>();
        }
        return this.nonDmclCtry;
    }

    /**
     * Gets the value of the owndSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getOwndSctiesQty() {
        return owndSctiesQty;
    }

    /**
     * Sets the value of the owndSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public PartyIdentification50 setOwndSctiesQty(FinancialInstrumentQuantity1Choice value) {
        this.owndSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the certfctnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certfctnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertfctnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficiaryCertificationType2Choice }
     * 
     * 
     */
    public List<BeneficiaryCertificationType2Choice> getCertfctnTp() {
        if (certfctnTp == null) {
            certfctnTp = new ArrayList<BeneficiaryCertificationType2Choice>();
        }
        return this.certfctnTp;
    }

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrtnDtls() {
        return dclrtnDtls;
    }

    /**
     * Sets the value of the dclrtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification50 setDclrtnDtls(String value) {
        this.dclrtnDtls = value;
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
     * Adds a new item to the altrnId list.
     * @see #getAltrnId()
     * 
     */
    public PartyIdentification50 addAltrnId(AlternatePartyIdentification2 altrnId) {
        getAltrnId().add(altrnId);
        return this;
    }

    /**
     * Adds a new item to the nonDmclCtry list.
     * @see #getNonDmclCtry()
     * 
     */
    public PartyIdentification50 addNonDmclCtry(String nonDmclCtry) {
        getNonDmclCtry().add(nonDmclCtry);
        return this;
    }

    /**
     * Adds a new item to the certfctnTp list.
     * @see #getCertfctnTp()
     * 
     */
    public PartyIdentification50 addCertfctnTp(BeneficiaryCertificationType2Choice certfctnTp) {
        getCertfctnTp().add(certfctnTp);
        return this;
    }

}
