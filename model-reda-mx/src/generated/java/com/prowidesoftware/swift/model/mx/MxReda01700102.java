
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.017.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ptyRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.017.001.02")
public class MxReda01700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "PtyRpt", required = true)
    protected PartyReportV02 ptyRpt;
    public static final transient String BUSINESS_PROCESS = "reda";
    public static final transient int FUNCTIONALITY = 17;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, Contact14 .class, ErrorHandling1Code.class, ErrorHandling2Choice.class, ErrorHandling3Choice.class, ErrorHandling4 .class, ErrorHandling5 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, LockStatus1Code.class, MarketSpecificAttribute1 .class, MessageHeader3 .class, MxReda01700102 .class, NameAndAddress5 .class, NamePrefix2Code.class, OriginalBusinessQuery1 .class, OtherContact1 .class, PartyIdentification120Choice.class, PartyIdentification136 .class, PartyLockStatus1 .class, PartyName4 .class, PartyOrBusinessError4Choice.class, PartyOrOperationalError4Choice.class, PartyReport4 .class, PartyReportV02 .class, PostalAddress1 .class, PostalAddress28 .class, PreferredContactMethod2Code.class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, ResidenceType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemParty6 .class, SystemPartyIdentification8 .class, SystemPartyIdentification9 .class, SystemPartyType1Choice.class, SystemRestriction1 .class, TechnicalIdentification2Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.017.001.02";

    public MxReda01700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda01700102(final String xml) {
        this();
        MxReda01700102 tmp = parse(xml);
        ptyRpt = tmp.getPtyRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda01700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ptyRpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReportV02 }
     *     
     */
    public PartyReportV02 getPtyRpt() {
        return ptyRpt;
    }

    /**
     * Sets the value of the ptyRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReportV02 }
     *     
     */
    public MxReda01700102 setPtyRpt(PartyReportV02 value) {
        this.ptyRpt = value;
        return this;
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
    public static MxReda01700102 parse(String xml) {
        return ((MxReda01700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda01700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda01700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda01700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda01700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda01700102 parse(String xml, MxRead parserImpl) {
        return ((MxReda01700102) parserImpl.read(MxReda01700102 .class, xml, _classes));
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
     * Creates an MxReda01700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda01700102 message
     * @return
     *     a new instance of MxReda01700102
     */
    public static final MxReda01700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda01700102 .class);
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

}
