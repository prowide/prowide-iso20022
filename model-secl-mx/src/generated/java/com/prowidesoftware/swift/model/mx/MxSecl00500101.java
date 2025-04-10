
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
 * Class for secl.005.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mrgnRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:secl.005.001.01")
public class MxSecl00500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MrgnRpt", required = true)
    protected MarginReportV01 mrgnRpt;
    public static final transient String BUSINESS_PROCESS = "secl";
    public static final transient int FUNCTIONALITY = 5;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AlternatePartyIdentification4 .class, Amount2 .class, ClearingAccountType1Code.class, Collateral3 .class, CollateralType2Code.class, CopyDuplicate1Code.class, DateAndDateTimeChoice.class, DocumentIdentification11 .class, EventFrequency6Code.class, GenericIdentification29 .class, GenericIdentification30 .class, IdentificationSource3Choice.class, IdentificationType6Choice.class, Margin2 .class, MarginProduct1Code.class, MarginProductType1Choice.class, MarginReport1 .class, MarginReportV01 .class, MarginResult1Choice.class, MxSecl00500101 .class, NameAndAddress6 .class, OtherIdentification1 .class, Pagination.class, PartyIdentification33Choice.class, PartyIdentification35Choice.class, PartyIdentificationAndAccount31 .class, PartyTextInformation1 .class, PostalAddress2 .class, ReportParameters3 .class, SecuritiesAccount18 .class, SecurityIdentification14 .class, ShortLong1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalVariationMargin1 .class, TypeOfIdentification1Code.class, VariationMargin2 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:secl.005.001.01";

    public MxSecl00500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSecl00500101(final String xml) {
        this();
        MxSecl00500101 tmp = parse(xml);
        mrgnRpt = tmp.getMrgnRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSecl00500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mrgnRpt property.
     * 
     * @return
     *     possible object is
     *     {@link MarginReportV01 }
     *     
     */
    public MarginReportV01 getMrgnRpt() {
        return mrgnRpt;
    }

    /**
     * Sets the value of the mrgnRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginReportV01 }
     *     
     */
    public MxSecl00500101 setMrgnRpt(MarginReportV01 value) {
        this.mrgnRpt = value;
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
    public static MxSecl00500101 parse(String xml) {
        return ((MxSecl00500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl00500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSecl00500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSecl00500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSecl00500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSecl00500101 parse(String xml, MxRead parserImpl) {
        return ((MxSecl00500101) parserImpl.read(MxSecl00500101 .class, xml, _classes));
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
     * Creates an MxSecl00500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSecl00500101 message
     * @return
     *     a new instance of MxSecl00500101
     */
    public static final MxSecl00500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSecl00500101 .class);
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
