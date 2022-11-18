
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information for the MTM to build or include delegated actions in the management plan of the POI.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceDelegateAction5", propOrder = {
    "prdcActn",
    "tmRmotAccs",
    "tmsPrtcol",
    "tmsPrtcolVrsn",
    "dataSetId",
    "reTry",
    "addtlInf",
    "actn"
})
public class MaintenanceDelegateAction5 {

    @XmlElement(name = "PrdcActn")
    protected Boolean prdcActn;
    @XmlElement(name = "TMRmotAccs")
    protected NetworkParameters7 tmRmotAccs;
    @XmlElement(name = "TMSPrtcol")
    protected String tmsPrtcol;
    @XmlElement(name = "TMSPrtcolVrsn")
    protected String tmsPrtcolVrsn;
    @XmlElement(name = "DataSetId")
    protected DataSetIdentification8 dataSetId;
    @XmlElement(name = "ReTry")
    protected ProcessRetry2 reTry;
    @XmlElement(name = "AddtlInf")
    protected List<byte[]> addtlInf;
    @XmlElement(name = "Actn")
    protected List<TMSAction8> actn;

    /**
     * Gets the value of the prdcActn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrdcActn() {
        return prdcActn;
    }

    /**
     * Sets the value of the prdcActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MaintenanceDelegateAction5 setPrdcActn(Boolean value) {
        this.prdcActn = value;
        return this;
    }

    /**
     * Gets the value of the tmRmotAccs property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters7 getTMRmotAccs() {
        return tmRmotAccs;
    }

    /**
     * Sets the value of the tmRmotAccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters7 }
     *     
     */
    public MaintenanceDelegateAction5 setTMRmotAccs(NetworkParameters7 value) {
        this.tmRmotAccs = value;
        return this;
    }

    /**
     * Gets the value of the tmsPrtcol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSPrtcol() {
        return tmsPrtcol;
    }

    /**
     * Sets the value of the tmsPrtcol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MaintenanceDelegateAction5 setTMSPrtcol(String value) {
        this.tmsPrtcol = value;
        return this;
    }

    /**
     * Gets the value of the tmsPrtcolVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSPrtcolVrsn() {
        return tmsPrtcolVrsn;
    }

    /**
     * Sets the value of the tmsPrtcolVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MaintenanceDelegateAction5 setTMSPrtcolVrsn(String value) {
        this.tmsPrtcolVrsn = value;
        return this;
    }

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification8 }
     *     
     */
    public DataSetIdentification8 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification8 }
     *     
     */
    public MaintenanceDelegateAction5 setDataSetId(DataSetIdentification8 value) {
        this.dataSetId = value;
        return this;
    }

    /**
     * Gets the value of the reTry property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRetry2 }
     *     
     */
    public ProcessRetry2 getReTry() {
        return reTry;
    }

    /**
     * Sets the value of the reTry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRetry2 }
     *     
     */
    public MaintenanceDelegateAction5 setReTry(ProcessRetry2 value) {
        this.reTry = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<byte[]>();
        }
        return this.addtlInf;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMSAction8 }
     * 
     * 
     */
    public List<TMSAction8> getActn() {
        if (actn == null) {
            actn = new ArrayList<TMSAction8>();
        }
        return this.actn;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public MaintenanceDelegateAction5 addAddtlInf(byte[] addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

    /**
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public MaintenanceDelegateAction5 addActn(TMSAction8 actn) {
        getActn().add(actn);
        return this;
    }

}
