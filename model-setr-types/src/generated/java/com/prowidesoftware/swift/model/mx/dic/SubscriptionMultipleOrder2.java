
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Order to invest the investor's principal in an investment fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionMultipleOrder2", propOrder = {
    "plcOfTrad",
    "ordrDtTm",
    "xpryDtTm",
    "cxlRght",
    "invstmtAcctDtls",
    "bnfcryDtls",
    "indvOrdrDtls",
    "blkCshSttlmDtls"
})
public class SubscriptionMultipleOrder2 {

    @XmlElement(name = "PlcOfTrad")
    protected String plcOfTrad;
    @XmlElement(name = "OrdrDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordrDtTm;
    @XmlElement(name = "XpryDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xpryDtTm;
    @XmlElement(name = "CxlRght")
    protected CancellationRight1 cxlRght;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount13 invstmtAcctDtls;
    @XmlElement(name = "BnfcryDtls")
    protected IndividualPerson2 bnfcryDtls;
    @XmlElement(name = "IndvOrdrDtls", required = true)
    protected List<SubscriptionOrder4> indvOrdrDtls;
    @XmlElement(name = "BlkCshSttlmDtls")
    protected PaymentTransaction19 blkCshSttlmDtls;

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionMultipleOrder2 setPlcOfTrad(String value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the ordrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getOrdrDtTm() {
        return ordrDtTm;
    }

    /**
     * Sets the value of the ordrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionMultipleOrder2 setOrdrDtTm(XMLGregorianCalendar value) {
        this.ordrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the xpryDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getXpryDtTm() {
        return xpryDtTm;
    }

    /**
     * Sets the value of the xpryDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SubscriptionMultipleOrder2 setXpryDtTm(XMLGregorianCalendar value) {
        this.xpryDtTm = value;
        return this;
    }

    /**
     * Gets the value of the cxlRght property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationRight1 }
     *     
     */
    public CancellationRight1 getCxlRght() {
        return cxlRght;
    }

    /**
     * Sets the value of the cxlRght property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRight1 }
     *     
     */
    public SubscriptionMultipleOrder2 setCxlRght(CancellationRight1 value) {
        this.cxlRght = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount13 }
     *     
     */
    public InvestmentAccount13 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount13 }
     *     
     */
    public SubscriptionMultipleOrder2 setInvstmtAcctDtls(InvestmentAccount13 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson2 }
     *     
     */
    public IndividualPerson2 getBnfcryDtls() {
        return bnfcryDtls;
    }

    /**
     * Sets the value of the bnfcryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson2 }
     *     
     */
    public SubscriptionMultipleOrder2 setBnfcryDtls(IndividualPerson2 value) {
        this.bnfcryDtls = value;
        return this;
    }

    /**
     * Gets the value of the indvOrdrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indvOrdrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvOrdrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionOrder4 }
     * 
     * 
     */
    public List<SubscriptionOrder4> getIndvOrdrDtls() {
        if (indvOrdrDtls == null) {
            indvOrdrDtls = new ArrayList<SubscriptionOrder4>();
        }
        return this.indvOrdrDtls;
    }

    /**
     * Gets the value of the blkCshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction19 }
     *     
     */
    public PaymentTransaction19 getBlkCshSttlmDtls() {
        return blkCshSttlmDtls;
    }

    /**
     * Sets the value of the blkCshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction19 }
     *     
     */
    public SubscriptionMultipleOrder2 setBlkCshSttlmDtls(PaymentTransaction19 value) {
        this.blkCshSttlmDtls = value;
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
     * Adds a new item to the indvOrdrDtls list.
     * @see #getIndvOrdrDtls()
     * 
     */
    public SubscriptionMultipleOrder2 addIndvOrdrDtls(SubscriptionOrder4 indvOrdrDtls) {
        getIndvOrdrDtls().add(indvOrdrDtls);
        return this;
    }

}
