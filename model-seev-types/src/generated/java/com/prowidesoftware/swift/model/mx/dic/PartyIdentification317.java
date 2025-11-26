
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
@XmlType(name = "PartyIdentification317", propOrder = {
    "ownrId",
    "leiId",
    "altrnId",
    "dmclCtry",
    "nonDmclCtry",
    "owndSctiesQty",
    "certfctnTp",
    "whldgTaxRate",
    "certfctnBrkdwn"
})
public class PartyIdentification317 {

    @XmlElement(name = "OwnrId", required = true)
    protected PartyIdentification259Choice ownrId;
    @XmlElement(name = "LEIId")
    protected String leiId;
    @XmlElement(name = "AltrnId")
    protected List<AlternatePartyIdentification9> altrnId;
    @XmlElement(name = "DmclCtry")
    protected String dmclCtry;
    @XmlElement(name = "NonDmclCtry")
    protected List<String> nonDmclCtry;
    @XmlElement(name = "OwndSctiesQty", required = true)
    protected FinancialInstrumentQuantity36Choice owndSctiesQty;
    @XmlElement(name = "CertfctnTp")
    protected List<BeneficiaryCertificationType11Choice> certfctnTp;
    @XmlElement(name = "WhldgTaxRate")
    protected RateAndAmountFormat63Choice whldgTaxRate;
    @XmlElement(name = "CertfctnBrkdwn")
    protected List<String> certfctnBrkdwn;

    /**
     * Gets the value of the ownrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification259Choice }
     *     
     */
    public PartyIdentification259Choice getOwnrId() {
        return ownrId;
    }

    /**
     * Sets the value of the ownrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification259Choice }
     *     
     */
    public PartyIdentification317 setOwnrId(PartyIdentification259Choice value) {
        this.ownrId = value;
        return this;
    }

    /**
     * Gets the value of the leiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEIId() {
        return leiId;
    }

    /**
     * Sets the value of the leiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification317 setLEIId(String value) {
        this.leiId = value;
        return this;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the altrnId property.
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
     * {@link AlternatePartyIdentification9 }
     * 
     * 
     * @return
     *     The value of the altrnId property.
     */
    public List<AlternatePartyIdentification9> getAltrnId() {
        if (altrnId == null) {
            altrnId = new ArrayList<>();
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
    public PartyIdentification317 setDmclCtry(String value) {
        this.dmclCtry = value;
        return this;
    }

    /**
     * Gets the value of the nonDmclCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nonDmclCtry property.
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
     * @return
     *     The value of the nonDmclCtry property.
     */
    public List<String> getNonDmclCtry() {
        if (nonDmclCtry == null) {
            nonDmclCtry = new ArrayList<>();
        }
        return this.nonDmclCtry;
    }

    /**
     * Gets the value of the owndSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getOwndSctiesQty() {
        return owndSctiesQty;
    }

    /**
     * Sets the value of the owndSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public PartyIdentification317 setOwndSctiesQty(FinancialInstrumentQuantity36Choice value) {
        this.owndSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the certfctnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certfctnTp property.
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
     * {@link BeneficiaryCertificationType11Choice }
     * 
     * 
     * @return
     *     The value of the certfctnTp property.
     */
    public List<BeneficiaryCertificationType11Choice> getCertfctnTp() {
        if (certfctnTp == null) {
            certfctnTp = new ArrayList<>();
        }
        return this.certfctnTp;
    }

    /**
     * Gets the value of the whldgTaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat63Choice }
     *     
     */
    public RateAndAmountFormat63Choice getWhldgTaxRate() {
        return whldgTaxRate;
    }

    /**
     * Sets the value of the whldgTaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat63Choice }
     *     
     */
    public PartyIdentification317 setWhldgTaxRate(RateAndAmountFormat63Choice value) {
        this.whldgTaxRate = value;
        return this;
    }

    /**
     * Gets the value of the certfctnBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the certfctnBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertfctnBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the certfctnBrkdwn property.
     */
    public List<String> getCertfctnBrkdwn() {
        if (certfctnBrkdwn == null) {
            certfctnBrkdwn = new ArrayList<>();
        }
        return this.certfctnBrkdwn;
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
    public PartyIdentification317 addAltrnId(AlternatePartyIdentification9 altrnId) {
        getAltrnId().add(altrnId);
        return this;
    }

    /**
     * Adds a new item to the nonDmclCtry list.
     * @see #getNonDmclCtry()
     * 
     */
    public PartyIdentification317 addNonDmclCtry(String nonDmclCtry) {
        getNonDmclCtry().add(nonDmclCtry);
        return this;
    }

    /**
     * Adds a new item to the certfctnTp list.
     * @see #getCertfctnTp()
     * 
     */
    public PartyIdentification317 addCertfctnTp(BeneficiaryCertificationType11Choice certfctnTp) {
        getCertfctnTp().add(certfctnTp);
        return this;
    }

    /**
     * Adds a new item to the certfctnBrkdwn list.
     * @see #getCertfctnBrkdwn()
     * 
     */
    public PartyIdentification317 addCertfctnBrkdwn(String certfctnBrkdwn) {
        getCertfctnBrkdwn().add(certfctnBrkdwn);
        return this;
    }

}
