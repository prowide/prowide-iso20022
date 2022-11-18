
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Agreement between two parties to sell a financial instrument or set of financial instruments and repurchase at an agreed later date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepurchaseAgreement2", propOrder = {
    "mtrtyDt",
    "scndLegPric",
    "collMktVal",
    "ctrPty",
    "rpAgrmtTp",
    "trptyAgtId"
})
public class RepurchaseAgreement2 {

    @XmlElement(name = "MtrtyDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "ScndLegPric", required = true)
    protected ActiveCurrencyAndAmount scndLegPric;
    @XmlElement(name = "CollMktVal", required = true)
    protected ActiveCurrencyAndAmount collMktVal;
    @XmlElement(name = "CtrPty", required = true)
    protected String ctrPty;
    @XmlElement(name = "RpAgrmtTp", required = true)
    protected RepurchaseAgreementType3Choice rpAgrmtTp;
    @XmlElement(name = "TrptyAgtId")
    protected String trptyAgtId;

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RepurchaseAgreement2 setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the scndLegPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getScndLegPric() {
        return scndLegPric;
    }

    /**
     * Sets the value of the scndLegPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public RepurchaseAgreement2 setScndLegPric(ActiveCurrencyAndAmount value) {
        this.scndLegPric = value;
        return this;
    }

    /**
     * Gets the value of the collMktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCollMktVal() {
        return collMktVal;
    }

    /**
     * Sets the value of the collMktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public RepurchaseAgreement2 setCollMktVal(ActiveCurrencyAndAmount value) {
        this.collMktVal = value;
        return this;
    }

    /**
     * Gets the value of the ctrPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPty() {
        return ctrPty;
    }

    /**
     * Sets the value of the ctrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RepurchaseAgreement2 setCtrPty(String value) {
        this.ctrPty = value;
        return this;
    }

    /**
     * Gets the value of the rpAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link RepurchaseAgreementType3Choice }
     *     
     */
    public RepurchaseAgreementType3Choice getRpAgrmtTp() {
        return rpAgrmtTp;
    }

    /**
     * Sets the value of the rpAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepurchaseAgreementType3Choice }
     *     
     */
    public RepurchaseAgreement2 setRpAgrmtTp(RepurchaseAgreementType3Choice value) {
        this.rpAgrmtTp = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtId() {
        return trptyAgtId;
    }

    /**
     * Sets the value of the trptyAgtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RepurchaseAgreement2 setTrptyAgtId(String value) {
        this.trptyAgtId = value;
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
