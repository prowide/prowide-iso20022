
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Defines the criteria used to search for system business day information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDaySearchCriteria2", propOrder = {
    "sysDt",
    "sysId",
    "sysCcy",
    "evtTp",
    "clsrPrd"
})
public class BusinessDaySearchCriteria2 {

    @XmlElement(name = "SysDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sysDt;
    @XmlElement(name = "SysId")
    protected List<SystemIdentification2Choice> sysId;
    @XmlElement(name = "SysCcy")
    protected List<String> sysCcy;
    @XmlElement(name = "EvtTp")
    protected SystemEventType2Choice evtTp;
    @XmlElement(name = "ClsrPrd")
    protected DateTimePeriod1Choice clsrPrd;

    /**
     * Gets the value of the sysDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getSysDt() {
        return sysDt;
    }

    /**
     * Sets the value of the sysDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BusinessDaySearchCriteria2 setSysDt(XMLGregorianCalendar value) {
        this.sysDt = value;
        return this;
    }

    /**
     * Gets the value of the sysId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sysId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSysId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemIdentification2Choice }
     * 
     * 
     */
    public List<SystemIdentification2Choice> getSysId() {
        if (sysId == null) {
            sysId = new ArrayList<SystemIdentification2Choice>();
        }
        return this.sysId;
    }

    /**
     * Gets the value of the sysCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sysCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSysCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSysCcy() {
        if (sysCcy == null) {
            sysCcy = new ArrayList<String>();
        }
        return this.sysCcy;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventType2Choice }
     *     
     */
    public SystemEventType2Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventType2Choice }
     *     
     */
    public BusinessDaySearchCriteria2 setEvtTp(SystemEventType2Choice value) {
        this.evtTp = value;
        return this;
    }

    /**
     * Gets the value of the clsrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getClsrPrd() {
        return clsrPrd;
    }

    /**
     * Sets the value of the clsrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public BusinessDaySearchCriteria2 setClsrPrd(DateTimePeriod1Choice value) {
        this.clsrPrd = value;
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
     * Adds a new item to the sysId list.
     * @see #getSysId()
     * 
     */
    public BusinessDaySearchCriteria2 addSysId(SystemIdentification2Choice sysId) {
        getSysId().add(sysId);
        return this;
    }

    /**
     * Adds a new item to the sysCcy list.
     * @see #getSysCcy()
     * 
     */
    public BusinessDaySearchCriteria2 addSysCcy(String sysCcy) {
        getSysCcy().add(sysCcy);
        return this;
    }

}
