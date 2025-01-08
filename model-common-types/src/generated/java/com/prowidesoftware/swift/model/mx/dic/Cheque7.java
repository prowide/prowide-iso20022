
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of characteristics related to a cheque instruction, such as cheque type or cheque number.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cheque7", propOrder = {
    "chqTp",
    "chqNb",
    "chqFr",
    "dlvryMtd",
    "dlvrTo",
    "instrPrty",
    "chqMtrtyDt",
    "frmsCd",
    "memoFld",
    "rgnlClrZone",
    "prtLctn",
    "sgntr"
})
public class Cheque7 {

    @XmlElement(name = "ChqTp")
    @XmlSchemaType(name = "string")
    protected ChequeType2Code chqTp;
    @XmlElement(name = "ChqNb")
    protected String chqNb;
    @XmlElement(name = "ChqFr")
    protected NameAndAddress10 chqFr;
    @XmlElement(name = "DlvryMtd")
    protected ChequeDeliveryMethod1Choice dlvryMtd;
    @XmlElement(name = "DlvrTo")
    protected NameAndAddress10 dlvrTo;
    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    protected Priority2Code instrPrty;
    @XmlElement(name = "ChqMtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate chqMtrtyDt;
    @XmlElement(name = "FrmsCd")
    protected String frmsCd;
    @XmlElement(name = "MemoFld")
    protected List<String> memoFld;
    @XmlElement(name = "RgnlClrZone")
    protected String rgnlClrZone;
    @XmlElement(name = "PrtLctn")
    protected String prtLctn;
    @XmlElement(name = "Sgntr")
    protected List<String> sgntr;

    /**
     * Gets the value of the chqTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeType2Code }
     *     
     */
    public ChequeType2Code getChqTp() {
        return chqTp;
    }

    /**
     * Sets the value of the chqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeType2Code }
     *     
     */
    public Cheque7 setChqTp(ChequeType2Code value) {
        this.chqTp = value;
        return this;
    }

    /**
     * Gets the value of the chqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChqNb() {
        return chqNb;
    }

    /**
     * Sets the value of the chqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque7 setChqNb(String value) {
        this.chqNb = value;
        return this;
    }

    /**
     * Gets the value of the chqFr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress10 }
     *     
     */
    public NameAndAddress10 getChqFr() {
        return chqFr;
    }

    /**
     * Sets the value of the chqFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress10 }
     *     
     */
    public Cheque7 setChqFr(NameAndAddress10 value) {
        this.chqFr = value;
        return this;
    }

    /**
     * Gets the value of the dlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeDeliveryMethod1Choice }
     *     
     */
    public ChequeDeliveryMethod1Choice getDlvryMtd() {
        return dlvryMtd;
    }

    /**
     * Sets the value of the dlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeDeliveryMethod1Choice }
     *     
     */
    public Cheque7 setDlvryMtd(ChequeDeliveryMethod1Choice value) {
        this.dlvryMtd = value;
        return this;
    }

    /**
     * Gets the value of the dlvrTo property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress10 }
     *     
     */
    public NameAndAddress10 getDlvrTo() {
        return dlvrTo;
    }

    /**
     * Sets the value of the dlvrTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress10 }
     *     
     */
    public Cheque7 setDlvrTo(NameAndAddress10 value) {
        this.dlvrTo = value;
        return this;
    }

    /**
     * Gets the value of the instrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    public Priority2Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Sets the value of the instrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public Cheque7 setInstrPrty(Priority2Code value) {
        this.instrPrty = value;
        return this;
    }

    /**
     * Gets the value of the chqMtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getChqMtrtyDt() {
        return chqMtrtyDt;
    }

    /**
     * Sets the value of the chqMtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque7 setChqMtrtyDt(LocalDate value) {
        this.chqMtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the frmsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmsCd() {
        return frmsCd;
    }

    /**
     * Sets the value of the frmsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque7 setFrmsCd(String value) {
        this.frmsCd = value;
        return this;
    }

    /**
     * Gets the value of the memoFld property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the memoFld property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemoFld().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the memoFld property.
     */
    public List<String> getMemoFld() {
        if (memoFld == null) {
            memoFld = new ArrayList<>();
        }
        return this.memoFld;
    }

    /**
     * Gets the value of the rgnlClrZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgnlClrZone() {
        return rgnlClrZone;
    }

    /**
     * Sets the value of the rgnlClrZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque7 setRgnlClrZone(String value) {
        this.rgnlClrZone = value;
        return this;
    }

    /**
     * Gets the value of the prtLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtLctn() {
        return prtLctn;
    }

    /**
     * Sets the value of the prtLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque7 setPrtLctn(String value) {
        this.prtLctn = value;
        return this;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sgntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSgntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the sgntr property.
     */
    public List<String> getSgntr() {
        if (sgntr == null) {
            sgntr = new ArrayList<>();
        }
        return this.sgntr;
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
     * Adds a new item to the memoFld list.
     * @see #getMemoFld()
     * 
     */
    public Cheque7 addMemoFld(String memoFld) {
        getMemoFld().add(memoFld);
        return this;
    }

    /**
     * Adds a new item to the sgntr list.
     * @see #getSgntr()
     * 
     */
    public Cheque7 addSgntr(String sgntr) {
        getSgntr().add(sgntr);
        return this;
    }

}
