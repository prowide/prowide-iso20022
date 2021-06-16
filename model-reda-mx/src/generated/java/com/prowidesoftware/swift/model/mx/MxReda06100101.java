
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.061.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "netgCutOffRefDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.061.001.01")
public class MxReda06100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NetgCutOffRefDataRpt", required = true)
    protected NettingCutOffReferenceDataReportV01 netgCutOffRefDataRpt;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 61;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, ClearingSystemIdentification2Choice.class, CutOff1 .class, CutOffData1 .class, MxReda06100101 .class, NameAndAddress8 .class, NettingCutOff1 .class, NettingCutOffReferenceDataReportV01 .class, NettingCutOffReportData1 .class, NettingIdentification1Choice.class, Pagination.class, PartyIdentification44 .class, PartyIdentification59 .class, PartyIdentification73Choice.class, PostalAddress1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.061.001.01";

    public MxReda06100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda06100101(final String xml) {
        this();
        MxReda06100101 tmp = parse(xml);
        netgCutOffRefDataRpt = tmp.getNetgCutOffRefDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda06100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the netgCutOffRefDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link NettingCutOffReferenceDataReportV01 }
     *     
     */
    public NettingCutOffReferenceDataReportV01 getNetgCutOffRefDataRpt() {
        return netgCutOffRefDataRpt;
    }

    /**
     * Sets the value of the netgCutOffRefDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingCutOffReferenceDataReportV01 }
     *     
     */
    public MxReda06100101 setNetgCutOffRefDataRpt(NettingCutOffReferenceDataReportV01 value) {
        this.netgCutOffRefDataRpt = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxReda06100101 parse(String xml) {
        return ((MxReda06100101) MxReadImpl.parse(MxReda06100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda06100101 parse(String xml, MxRead parserImpl) {
        return ((MxReda06100101) parserImpl.read(MxReda06100101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxReda06100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda06100101 message
     * @return
     *     a new instance of MxReda06100101
     */
    public final static MxReda06100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda06100101 .class);
    }

}
