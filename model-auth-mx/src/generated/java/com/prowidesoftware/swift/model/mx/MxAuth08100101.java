
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
 * Class for auth.081.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invstrRgltryDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.081.001.01")
public class MxAuth08100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "InvstrRgltryDataRpt", required = true)
    protected InvestorRegulatoryDataReportV01 invstrRgltryDataRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 81;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, ContactDetails2 .class, DateAndPlaceOfBirth2 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Identification25 .class, IdentificationSource3Choice.class, InvestorRegulatoryDataReportV01 .class, MxAuth08100101 .class, NameAndAddress5 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OtherIdentification1 .class, Party37Choice.class, PartyIdentification130 .class, PartyIdentification71Choice.class, PartyType2Choice.class, PersonIdentification16 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress1 .class, PostalAddress23 .class, SecuritiesAccount19 .class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxResidencyType1Code.class, TaxResidencyType3Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT2auth.081.001.01";

    public MxAuth08100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth08100101(final String xml) {
        this();
        MxAuth08100101 tmp = parse(xml);
        invstrRgltryDataRpt = tmp.getInvstrRgltryDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth08100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the invstrRgltryDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorRegulatoryDataReportV01 }
     *     
     */
    public InvestorRegulatoryDataReportV01 getInvstrRgltryDataRpt() {
        return invstrRgltryDataRpt;
    }

    /**
     * Sets the value of the invstrRgltryDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorRegulatoryDataReportV01 }
     *     
     */
    public MxAuth08100101 setInvstrRgltryDataRpt(InvestorRegulatoryDataReportV01 value) {
        this.invstrRgltryDataRpt = value;
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
    public static MxAuth08100101 parse(String xml) {
        return ((MxAuth08100101) MxReadImpl.parse(MxAuth08100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth08100101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth08100101) parserImpl.read(MxAuth08100101 .class, xml, _classes));
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
     * Creates an MxAuth08100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth08100101 message
     * @return
     *     a new instance of MxAuth08100101
     */
    public final static MxAuth08100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth08100101 .class);
    }

}
