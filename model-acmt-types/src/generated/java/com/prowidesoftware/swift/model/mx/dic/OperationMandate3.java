
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
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
 * Information specifying the Mandate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationMandate3", propOrder = {
    "modCd",
    "id",
    "aplblChanl",
    "reqrdSgntrNb",
    "sgntrOrdrInd",
    "mndtHldr",
    "bkOpr",
    "startDt",
    "endDt"
})
public class OperationMandate3 {

    @XmlElement(name = "ModCd")
    @XmlSchemaType(name = "string")
    protected Modification1Code modCd;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AplblChanl", required = true)
    protected List<Channel2Choice> aplblChanl;
    @XmlElement(name = "ReqrdSgntrNb", required = true)
    protected String reqrdSgntrNb;
    @XmlElement(name = "SgntrOrdrInd")
    protected boolean sgntrOrdrInd;
    @XmlElement(name = "MndtHldr")
    protected List<PartyAndAuthorisation3> mndtHldr;
    @XmlElement(name = "BkOpr", required = true)
    protected List<BankTransactionCodeStructure4> bkOpr;
    @XmlElement(name = "StartDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar startDt;
    @XmlElement(name = "EndDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar endDt;

    /**
     * Gets the value of the modCd property.
     * 
     * @return
     *     possible object is
     *     {@link Modification1Code }
     *     
     */
    public Modification1Code getModCd() {
        return modCd;
    }

    /**
     * Sets the value of the modCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modification1Code }
     *     
     */
    public OperationMandate3 setModCd(Modification1Code value) {
        this.modCd = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OperationMandate3 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the aplblChanl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the aplblChanl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAplblChanl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Channel2Choice }
     * 
     * 
     * @return
     *     The value of the aplblChanl property.
     */
    public List<Channel2Choice> getAplblChanl() {
        if (aplblChanl == null) {
            aplblChanl = new ArrayList<>();
        }
        return this.aplblChanl;
    }

    /**
     * Gets the value of the reqrdSgntrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqrdSgntrNb() {
        return reqrdSgntrNb;
    }

    /**
     * Sets the value of the reqrdSgntrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OperationMandate3 setReqrdSgntrNb(String value) {
        this.reqrdSgntrNb = value;
        return this;
    }

    /**
     * Gets the value of the sgntrOrdrInd property.
     * 
     */
    public boolean isSgntrOrdrInd() {
        return sgntrOrdrInd;
    }

    /**
     * Sets the value of the sgntrOrdrInd property.
     * 
     */
    public OperationMandate3 setSgntrOrdrInd(boolean value) {
        this.sgntrOrdrInd = value;
        return this;
    }

    /**
     * Gets the value of the mndtHldr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mndtHldr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMndtHldr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAndAuthorisation3 }
     * 
     * 
     * @return
     *     The value of the mndtHldr property.
     */
    public List<PartyAndAuthorisation3> getMndtHldr() {
        if (mndtHldr == null) {
            mndtHldr = new ArrayList<>();
        }
        return this.mndtHldr;
    }

    /**
     * Gets the value of the bkOpr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bkOpr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBkOpr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankTransactionCodeStructure4 }
     * 
     * 
     * @return
     *     The value of the bkOpr property.
     */
    public List<BankTransactionCodeStructure4> getBkOpr() {
        if (bkOpr == null) {
            bkOpr = new ArrayList<>();
        }
        return this.bkOpr;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OperationMandate3 setStartDt(Calendar value) {
        this.startDt = value;
        return this;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OperationMandate3 setEndDt(Calendar value) {
        this.endDt = value;
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
     * Adds a new item to the aplblChanl list.
     * @see #getAplblChanl()
     * 
     */
    public OperationMandate3 addAplblChanl(Channel2Choice aplblChanl) {
        getAplblChanl().add(aplblChanl);
        return this;
    }

    /**
     * Adds a new item to the mndtHldr list.
     * @see #getMndtHldr()
     * 
     */
    public OperationMandate3 addMndtHldr(PartyAndAuthorisation3 mndtHldr) {
        getMndtHldr().add(mndtHldr);
        return this;
    }

    /**
     * Adds a new item to the bkOpr list.
     * @see #getBkOpr()
     * 
     */
    public OperationMandate3 addBkOpr(BankTransactionCodeStructure4 bkOpr) {
        getBkOpr().add(bkOpr);
        return this;
    }

}
