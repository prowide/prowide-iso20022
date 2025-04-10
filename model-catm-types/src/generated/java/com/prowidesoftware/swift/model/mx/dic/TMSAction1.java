
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
 * Single terminal management action to be performed by the point of interaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSAction1", propOrder = {
    "tp",
    "adr",
    "dataSetId",
    "trggr",
    "addtlPrc",
    "tmCond",
    "errActn"
})
public class TMSAction1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction1Code tp;
    @XmlElement(name = "Adr")
    protected NetworkParameters1 adr;
    @XmlElement(name = "DataSetId")
    protected DataSetIdentification2 dataSetId;
    @XmlElement(name = "Trggr", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementActionTrigger1Code trggr;
    @XmlElement(name = "AddtlPrc")
    @XmlSchemaType(name = "string")
    protected TerminalManagementAdditionalProcess1Code addtlPrc;
    @XmlElement(name = "TmCond")
    protected ProcessTiming1 tmCond;
    @XmlElement(name = "ErrActn")
    protected List<ErrorAction1> errActn;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction1Code }
     *     
     */
    public TerminalManagementAction1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction1Code }
     *     
     */
    public TMSAction1 setTp(TerminalManagementAction1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters1 }
     *     
     */
    public NetworkParameters1 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters1 }
     *     
     */
    public TMSAction1 setAdr(NetworkParameters1 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification2 }
     *     
     */
    public DataSetIdentification2 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification2 }
     *     
     */
    public TMSAction1 setDataSetId(DataSetIdentification2 value) {
        this.dataSetId = value;
        return this;
    }

    /**
     * Gets the value of the trggr property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementActionTrigger1Code }
     *     
     */
    public TerminalManagementActionTrigger1Code getTrggr() {
        return trggr;
    }

    /**
     * Sets the value of the trggr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementActionTrigger1Code }
     *     
     */
    public TMSAction1 setTrggr(TerminalManagementActionTrigger1Code value) {
        this.trggr = value;
        return this;
    }

    /**
     * Gets the value of the addtlPrc property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAdditionalProcess1Code }
     *     
     */
    public TerminalManagementAdditionalProcess1Code getAddtlPrc() {
        return addtlPrc;
    }

    /**
     * Sets the value of the addtlPrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAdditionalProcess1Code }
     *     
     */
    public TMSAction1 setAddtlPrc(TerminalManagementAdditionalProcess1Code value) {
        this.addtlPrc = value;
        return this;
    }

    /**
     * Gets the value of the tmCond property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessTiming1 }
     *     
     */
    public ProcessTiming1 getTmCond() {
        return tmCond;
    }

    /**
     * Sets the value of the tmCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessTiming1 }
     *     
     */
    public TMSAction1 setTmCond(ProcessTiming1 value) {
        this.tmCond = value;
        return this;
    }

    /**
     * Gets the value of the errActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the errActn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorAction1 }
     * 
     * 
     * @return
     *     The value of the errActn property.
     */
    public List<ErrorAction1> getErrActn() {
        if (errActn == null) {
            errActn = new ArrayList<>();
        }
        return this.errActn;
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
     * Adds a new item to the errActn list.
     * @see #getErrActn()
     * 
     */
    public TMSAction1 addErrActn(ErrorAction1 errActn) {
        getErrActn().add(errActn);
        return this;
    }

}
