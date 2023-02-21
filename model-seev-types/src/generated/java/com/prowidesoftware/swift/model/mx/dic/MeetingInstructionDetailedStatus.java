
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
 * Status applying to individual instructions of a MeetingInstruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInstructionDetailedStatus", propOrder = {
    "acctId",
    "prtcptnRegnConf",
    "vtngInstrConf",
    "prxyAssgnmtConf",
    "mtgAttndncConf",
    "sctiesRegnConf"
})
public class MeetingInstructionDetailedStatus {

    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "PrtcptnRegnConf")
    protected List<DetailedInstructionConfirmation> prtcptnRegnConf;
    @XmlElement(name = "VtngInstrConf")
    protected List<DetailedInstructionConfirmation> vtngInstrConf;
    @XmlElement(name = "PrxyAssgnmtConf")
    protected List<DetailedInstructionConfirmation> prxyAssgnmtConf;
    @XmlElement(name = "MtgAttndncConf")
    protected List<DetailedInstructionConfirmation> mtgAttndncConf;
    @XmlElement(name = "SctiesRegnConf")
    protected List<DetailedInstructionConfirmation> sctiesRegnConf;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MeetingInstructionDetailedStatus setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the prtcptnRegnConf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtcptnRegnConf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtcptnRegnConf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedInstructionConfirmation }
     * 
     * 
     */
    public List<DetailedInstructionConfirmation> getPrtcptnRegnConf() {
        if (prtcptnRegnConf == null) {
            prtcptnRegnConf = new ArrayList<DetailedInstructionConfirmation>();
        }
        return this.prtcptnRegnConf;
    }

    /**
     * Gets the value of the vtngInstrConf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vtngInstrConf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVtngInstrConf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedInstructionConfirmation }
     * 
     * 
     */
    public List<DetailedInstructionConfirmation> getVtngInstrConf() {
        if (vtngInstrConf == null) {
            vtngInstrConf = new ArrayList<DetailedInstructionConfirmation>();
        }
        return this.vtngInstrConf;
    }

    /**
     * Gets the value of the prxyAssgnmtConf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prxyAssgnmtConf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrxyAssgnmtConf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedInstructionConfirmation }
     * 
     * 
     */
    public List<DetailedInstructionConfirmation> getPrxyAssgnmtConf() {
        if (prxyAssgnmtConf == null) {
            prxyAssgnmtConf = new ArrayList<DetailedInstructionConfirmation>();
        }
        return this.prxyAssgnmtConf;
    }

    /**
     * Gets the value of the mtgAttndncConf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mtgAttndncConf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtgAttndncConf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedInstructionConfirmation }
     * 
     * 
     */
    public List<DetailedInstructionConfirmation> getMtgAttndncConf() {
        if (mtgAttndncConf == null) {
            mtgAttndncConf = new ArrayList<DetailedInstructionConfirmation>();
        }
        return this.mtgAttndncConf;
    }

    /**
     * Gets the value of the sctiesRegnConf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesRegnConf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesRegnConf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedInstructionConfirmation }
     * 
     * 
     */
    public List<DetailedInstructionConfirmation> getSctiesRegnConf() {
        if (sctiesRegnConf == null) {
            sctiesRegnConf = new ArrayList<DetailedInstructionConfirmation>();
        }
        return this.sctiesRegnConf;
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
     * Adds a new item to the prtcptnRegnConf list.
     * @see #getPrtcptnRegnConf()
     * 
     */
    public MeetingInstructionDetailedStatus addPrtcptnRegnConf(DetailedInstructionConfirmation prtcptnRegnConf) {
        getPrtcptnRegnConf().add(prtcptnRegnConf);
        return this;
    }

    /**
     * Adds a new item to the vtngInstrConf list.
     * @see #getVtngInstrConf()
     * 
     */
    public MeetingInstructionDetailedStatus addVtngInstrConf(DetailedInstructionConfirmation vtngInstrConf) {
        getVtngInstrConf().add(vtngInstrConf);
        return this;
    }

    /**
     * Adds a new item to the prxyAssgnmtConf list.
     * @see #getPrxyAssgnmtConf()
     * 
     */
    public MeetingInstructionDetailedStatus addPrxyAssgnmtConf(DetailedInstructionConfirmation prxyAssgnmtConf) {
        getPrxyAssgnmtConf().add(prxyAssgnmtConf);
        return this;
    }

    /**
     * Adds a new item to the mtgAttndncConf list.
     * @see #getMtgAttndncConf()
     * 
     */
    public MeetingInstructionDetailedStatus addMtgAttndncConf(DetailedInstructionConfirmation mtgAttndncConf) {
        getMtgAttndncConf().add(mtgAttndncConf);
        return this;
    }

    /**
     * Adds a new item to the sctiesRegnConf list.
     * @see #getSctiesRegnConf()
     * 
     */
    public MeetingInstructionDetailedStatus addSctiesRegnConf(DetailedInstructionConfirmation sctiesRegnConf) {
        getSctiesRegnConf().add(sctiesRegnConf);
        return this;
    }

}
