
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
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Type of detailed aggregated position set report between a pair of counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedPosition3", propOrder = {
    "refDt",
    "gnlInf",
    "ln",
    "coll",
    "mrgn",
    "reuse"
})
public class NamedPosition3 {

    @XmlElement(name = "RefDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refDt;
    @XmlElement(name = "GnlInf")
    protected List<PositionSet16> gnlInf;
    @XmlElement(name = "Ln")
    protected List<PositionSet17> ln;
    @XmlElement(name = "Coll")
    protected List<PositionSet18> coll;
    @XmlElement(name = "Mrgn")
    protected List<PositionSet20> mrgn;
    @XmlElement(name = "Reuse")
    protected List<PositionSet19> reuse;

    /**
     * Gets the value of the refDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRefDt() {
        return refDt;
    }

    /**
     * Sets the value of the refDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NamedPosition3 setRefDt(XMLGregorianCalendar value) {
        this.refDt = value;
        return this;
    }

    /**
     * Gets the value of the gnlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gnlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGnlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet16 }
     * 
     * 
     */
    public List<PositionSet16> getGnlInf() {
        if (gnlInf == null) {
            gnlInf = new ArrayList<PositionSet16>();
        }
        return this.gnlInf;
    }

    /**
     * Gets the value of the ln property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ln property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet17 }
     * 
     * 
     */
    public List<PositionSet17> getLn() {
        if (ln == null) {
            ln = new ArrayList<PositionSet17>();
        }
        return this.ln;
    }

    /**
     * Gets the value of the coll property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coll property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet18 }
     * 
     * 
     */
    public List<PositionSet18> getColl() {
        if (coll == null) {
            coll = new ArrayList<PositionSet18>();
        }
        return this.coll;
    }

    /**
     * Gets the value of the mrgn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mrgn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrgn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet20 }
     * 
     * 
     */
    public List<PositionSet20> getMrgn() {
        if (mrgn == null) {
            mrgn = new ArrayList<PositionSet20>();
        }
        return this.mrgn;
    }

    /**
     * Gets the value of the reuse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reuse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReuse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionSet19 }
     * 
     * 
     */
    public List<PositionSet19> getReuse() {
        if (reuse == null) {
            reuse = new ArrayList<PositionSet19>();
        }
        return this.reuse;
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
     * Adds a new item to the gnlInf list.
     * @see #getGnlInf()
     * 
     */
    public NamedPosition3 addGnlInf(PositionSet16 gnlInf) {
        getGnlInf().add(gnlInf);
        return this;
    }

    /**
     * Adds a new item to the ln list.
     * @see #getLn()
     * 
     */
    public NamedPosition3 addLn(PositionSet17 ln) {
        getLn().add(ln);
        return this;
    }

    /**
     * Adds a new item to the coll list.
     * @see #getColl()
     * 
     */
    public NamedPosition3 addColl(PositionSet18 coll) {
        getColl().add(coll);
        return this;
    }

    /**
     * Adds a new item to the mrgn list.
     * @see #getMrgn()
     * 
     */
    public NamedPosition3 addMrgn(PositionSet20 mrgn) {
        getMrgn().add(mrgn);
        return this;
    }

    /**
     * Adds a new item to the reuse list.
     * @see #getReuse()
     * 
     */
    public NamedPosition3 addReuse(PositionSet19 reuse) {
        getReuse().add(reuse);
        return this;
    }

}
