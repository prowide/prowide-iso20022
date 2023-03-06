
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the transaction in the completion advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransactionDetails3", propOrder = {
    "ccy",
    "ttlAmt",
    "amtQlfr",
    "dtldAmt",
    "vldtyDt",
    "uattnddLvlCtgy",
    "acctTp",
    "rcrngTx",
    "pdct",
    "iccRltdData"
})
public class CardPaymentTransactionDetails3 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "TtlAmt", required = true)
    protected BigDecimal ttlAmt;
    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount1Code amtQlfr;
    @XmlElement(name = "DtldAmt")
    protected List<DetailedAmount1> dtldAmt;
    @XmlElement(name = "VldtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vldtyDt;
    @XmlElement(name = "UattnddLvlCtgy")
    protected String uattnddLvlCtgy;
    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType1Code acctTp;
    @XmlElement(name = "RcrngTx")
    protected RecurringTransaction1 rcrngTx;
    @XmlElement(name = "Pdct")
    protected List<Product1> pdct;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransactionDetails3 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardPaymentTransactionDetails3 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the amtQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount1Code }
     *     
     */
    public TypeOfAmount1Code getAmtQlfr() {
        return amtQlfr;
    }

    /**
     * Sets the value of the amtQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount1Code }
     *     
     */
    public CardPaymentTransactionDetails3 setAmtQlfr(TypeOfAmount1Code value) {
        this.amtQlfr = value;
        return this;
    }

    /**
     * Gets the value of the dtldAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtldAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount1 }
     * 
     * 
     */
    public List<DetailedAmount1> getDtldAmt() {
        if (dtldAmt == null) {
            dtldAmt = new ArrayList<DetailedAmount1>();
        }
        return this.dtldAmt;
    }

    /**
     * Gets the value of the vldtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getVldtyDt() {
        return vldtyDt;
    }

    /**
     * Sets the value of the vldtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransactionDetails3 setVldtyDt(XMLGregorianCalendar value) {
        this.vldtyDt = value;
        return this;
    }

    /**
     * Gets the value of the uattnddLvlCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUattnddLvlCtgy() {
        return uattnddLvlCtgy;
    }

    /**
     * Sets the value of the uattnddLvlCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransactionDetails3 setUattnddLvlCtgy(String value) {
        this.uattnddLvlCtgy = value;
        return this;
    }

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType1Code }
     *     
     */
    public CardAccountType1Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType1Code }
     *     
     */
    public CardPaymentTransactionDetails3 setAcctTp(CardAccountType1Code value) {
        this.acctTp = value;
        return this;
    }

    /**
     * Gets the value of the rcrngTx property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringTransaction1 }
     *     
     */
    public RecurringTransaction1 getRcrngTx() {
        return rcrngTx;
    }

    /**
     * Sets the value of the rcrngTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringTransaction1 }
     *     
     */
    public CardPaymentTransactionDetails3 setRcrngTx(RecurringTransaction1 value) {
        this.rcrngTx = value;
        return this;
    }

    /**
     * Gets the value of the pdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product1 }
     * 
     * 
     */
    public List<Product1> getPdct() {
        if (pdct == null) {
            pdct = new ArrayList<Product1>();
        }
        return this.pdct;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CardPaymentTransactionDetails3 setICCRltdData(byte[] value) {
        this.iccRltdData = value;
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
     * Adds a new item to the dtldAmt list.
     * @see #getDtldAmt()
     * 
     */
    public CardPaymentTransactionDetails3 addDtldAmt(DetailedAmount1 dtldAmt) {
        getDtldAmt().add(dtldAmt);
        return this;
    }

    /**
     * Adds a new item to the pdct list.
     * @see #getPdct()
     * 
     */
    public CardPaymentTransactionDetails3 addPdct(Product1 pdct) {
        getPdct().add(pdct);
        return this;
    }

}
