
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.061.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "netgCutOffRefDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.061.001.02")
public class MxReda06100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NetgCutOffRefDataRpt", required = true)
    protected NettingCutOffReferenceDataReportV02 netgCutOffRefDataRpt;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 61;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, ClearingSystemIdentification2Choice.class, CutOff1 .class, CutOffData2 .class, MxReda06100102 .class, NameAndAddress8 .class, NettingCutOff2 .class, NettingCutOffReferenceDataReportV02 .class, NettingCutOffReportData2 .class, NettingIdentification2Choice.class, Pagination1 .class, PartyIdentification242Choice.class, PartyIdentification265 .class, PartyIdentification266 .class, PostalAddress1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.061.001.02";

    public MxReda06100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda06100102(final String xml) {
        this();
        MxReda06100102 tmp = parse(xml);
        netgCutOffRefDataRpt = tmp.getNetgCutOffRefDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda06100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the netgCutOffRefDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link NettingCutOffReferenceDataReportV02 }
     *     
     */
    public NettingCutOffReferenceDataReportV02 getNetgCutOffRefDataRpt() {
        return netgCutOffRefDataRpt;
    }

    /**
     * Sets the value of the netgCutOffRefDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingCutOffReferenceDataReportV02 }
     *     
     */
    public MxReda06100102 setNetgCutOffRefDataRpt(NettingCutOffReferenceDataReportV02 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxReda06100102 parse(String xml) {
        return ((MxReda06100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda06100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda06100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda06100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda06100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda06100102 parse(String xml, MxRead parserImpl) {
        return ((MxReda06100102) parserImpl.read(MxReda06100102 .class, xml, _classes));
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
     * Creates an MxReda06100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda06100102 message
     * @return
     *     a new instance of MxReda06100102
     */
    public final static MxReda06100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda06100102 .class);
    }

}
