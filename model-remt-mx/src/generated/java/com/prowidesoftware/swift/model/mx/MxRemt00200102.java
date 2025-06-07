
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
 * Class for remt.002.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rmtLctnAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:remt.002.001.02")
public class MxRemt00200102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RmtLctnAdvc", required = true)
    protected RemittanceLocationAdviceV02 rmtLctnAdvc;
    public final static transient String BUSINESS_PROCESS = "remt";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, CopyDuplicate1Code.class, DateAndPlaceOfBirth1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader79 .class, MxRemt00200102 .class, NameAndAddress16 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party38Choice.class, PartyIdentification135 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, RemittanceLocation5 .class, RemittanceLocationAdviceV02 .class, RemittanceLocationData1 .class, RemittanceLocationMethod2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionReferences5 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:remt.002.001.02";

    public MxRemt00200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxRemt00200102(final String xml) {
        this();
        MxRemt00200102 tmp = parse(xml);
        rmtLctnAdvc = tmp.getRmtLctnAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxRemt00200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rmtLctnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceLocationAdviceV02 }
     *     
     */
    public RemittanceLocationAdviceV02 getRmtLctnAdvc() {
        return rmtLctnAdvc;
    }

    /**
     * Sets the value of the rmtLctnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceLocationAdviceV02 }
     *     
     */
    public MxRemt00200102 setRmtLctnAdvc(RemittanceLocationAdviceV02 value) {
        this.rmtLctnAdvc = value;
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
    public static MxRemt00200102 parse(String xml) {
        return ((MxRemt00200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxRemt00200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxRemt00200102 parse(String xml, MxReadConfiguration conf) {
        return ((MxRemt00200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxRemt00200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxRemt00200102 parse(String xml, MxRead parserImpl) {
        return ((MxRemt00200102) parserImpl.read(MxRemt00200102 .class, xml, _classes));
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
     * Creates an MxRemt00200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxRemt00200102 message
     * @return
     *     a new instance of MxRemt00200102
     */
    public final static MxRemt00200102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxRemt00200102 .class);
    }

}
