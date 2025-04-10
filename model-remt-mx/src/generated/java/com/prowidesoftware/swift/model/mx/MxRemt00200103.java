
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
 * Class for remt.002.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rmtLctnAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:remt.002.001.03")
public class MxRemt00200103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RmtLctnAdvc", required = true)
    protected RemittanceLocationAdviceV03 rmtLctnAdvc;
    public static final transient String BUSINESS_PROCESS = "remt";
    public static final transient int FUNCTIONALITY = 2;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, CopyDuplicate1Code.class, DateAndPlaceOfBirth1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, GroupHeader122 .class, MxRemt00200103 .class, NameAndAddress18 .class, NamePrefix2Code.class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party52Choice.class, PartyIdentification272 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, RemittanceLocation10 .class, RemittanceLocationAdviceV03 .class, RemittanceLocationData2 .class, RemittanceLocationMethod2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionReferences8 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:remt.002.001.03";

    public MxRemt00200103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxRemt00200103(final String xml) {
        this();
        MxRemt00200103 tmp = parse(xml);
        rmtLctnAdvc = tmp.getRmtLctnAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxRemt00200103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rmtLctnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceLocationAdviceV03 }
     *     
     */
    public RemittanceLocationAdviceV03 getRmtLctnAdvc() {
        return rmtLctnAdvc;
    }

    /**
     * Sets the value of the rmtLctnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceLocationAdviceV03 }
     *     
     */
    public MxRemt00200103 setRmtLctnAdvc(RemittanceLocationAdviceV03 value) {
        this.rmtLctnAdvc = value;
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
    public static MxRemt00200103 parse(String xml) {
        return ((MxRemt00200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxRemt00200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxRemt00200103 parse(String xml, MxReadConfiguration conf) {
        return ((MxRemt00200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxRemt00200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxRemt00200103 parse(String xml, MxRead parserImpl) {
        return ((MxRemt00200103) parserImpl.read(MxRemt00200103 .class, xml, _classes));
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
     * Creates an MxRemt00200103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxRemt00200103 message
     * @return
     *     a new instance of MxRemt00200103
     */
    public static final MxRemt00200103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxRemt00200103 .class);
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
